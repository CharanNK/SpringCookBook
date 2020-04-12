package com.charan.springcookbook.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Ingredient(){

    }

    public Ingredient(String description,BigDecimal amount,UnitOfMeasure uom){
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }

    public Ingredient(Long id) {
        this.id = id;
    }

    private String description;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

    public Ingredient(String description,BigDecimal amount,UnitOfMeasure uom,Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    }

}
