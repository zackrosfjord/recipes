package com.zrosfjord.recipes.repository;

import com.zrosfjord.recipes.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
