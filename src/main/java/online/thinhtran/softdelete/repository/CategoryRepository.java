package online.thinhtran.softdelete.repository;

import online.thinhtran.softdelete.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}