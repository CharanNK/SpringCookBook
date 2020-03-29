package com.charan.springcookbook.controllers;

import com.charan.springcookbook.domain.Category;
import com.charan.springcookbook.domain.UnitOfMeasure;
import com.charan.springcookbook.repositories.CategoryRepository;
import com.charan.springcookbook.repositories.UnitOfMeasureRepository;
import com.charan.springcookbook.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","index.html","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes",recipeService.getRecipes());

        return "index";
    }
}
