package com.charan.springcookbook.repositories;

import com.charan.springcookbook.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
