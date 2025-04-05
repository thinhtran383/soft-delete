package online.thinhtran.softdelete.service;

import lombok.RequiredArgsConstructor;
import online.thinhtran.softdelete.dto.request.CategoryRequest;
import online.thinhtran.softdelete.dto.response.CategoryResponse;
import online.thinhtran.softdelete.entity.Category;
import online.thinhtran.softdelete.repository.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    @Transactional
    public CategoryResponse createCategory(CategoryRequest categoryRequest) {
        return modelMapper.map(categoryRepository.save(modelMapper.map(categoryRequest, Category.class)), CategoryResponse.class);
    }

    @Transactional(readOnly = true)
    public List<CategoryResponse> getAllCategories() {
        return categoryRepository.findAll().stream().map(category -> modelMapper.map(category, CategoryResponse.class)).toList();
    }

    @Transactional
    public CategoryResponse deleteCategory(Integer id) {
        Category category = categoryRepository.findById(id).orElseThrow();

        categoryRepository.delete(category);

        return modelMapper.map(category, CategoryResponse.class);
    }
}
