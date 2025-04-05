package online.thinhtran.softdelete.controller;

import lombok.RequiredArgsConstructor;
import online.thinhtran.softdelete.dto.request.CategoryRequest;
import online.thinhtran.softdelete.dto.response.CategoryResponse;
import online.thinhtran.softdelete.service.CategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${api.v1}/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryResponse>> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @PostMapping
    public ResponseEntity<CategoryResponse> createCategory(
            @RequestBody CategoryRequest categoryRequest
    ) {
        return ResponseEntity.ok(categoryService.createCategory(categoryRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CategoryResponse> deleteCategory(
            @PathVariable Integer id
    ) {
        return ResponseEntity.ok(categoryService.deleteCategory(id));
    }
}
