package me.learnspring.recipeproject.repositories;

import me.learnspring.recipeproject.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
