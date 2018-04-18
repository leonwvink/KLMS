package com.capgemini.View;

import com.capgemini.Model.Ingredient;

public class IngredientView {
    public void printIngredientListByName(Ingredient[] ingredients){
        for(Ingredient ingredient:ingredients){
            System.out.println(ingredient.getName());
        }
    }

    public void printDetailsOfAnIngredient(Ingredient ingredient){
        System.out.println("Ingredient: " + ingredient.getName() + " has the quantity " + ingredient.getQuantityInStorageInKiloGram() +" in storage, and the costprice i" );
    }
}
