package com.zrosfjord.recipes.repository;

import com.zrosfjord.recipes.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
