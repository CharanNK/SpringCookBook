package com.charan.springcookbook.services;

import com.charan.springcookbook.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
