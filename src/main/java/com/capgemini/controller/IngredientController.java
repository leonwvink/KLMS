package com.capgemini.controller;

import com.capgemini.model.Ingredient;
import com.capgemini.view.IngredientView;


public class IngredientController extends BaseController {
    private Ingredient[] allIngredients;
    private IngredientView view = new IngredientView();

    public IngredientController() {
    }

    public void registerIngredient(String name, double pricePerGram, int quantity) {
        if (arrayContainsItemByName(name, allIngredients)) {
            addToQuantity(name, quantity);
            getIngredientByName(name).setPricePerGram(pricePerGram); //TODO: Change price on calculation?
        }
        else{
            newIngredient(name, pricePerGram,quantity);
        }
    }

    private void newIngredient(String name, double pricePerGram, int quantityInStorageInKiloGram) {
        Ingredient ingredient = new Ingredient(name, pricePerGram, quantityInStorageInKiloGram);
        allIngredients = addToArray(ingredient, allIngredients);
    }

    private void addToQuantity(String name, int quantityToAdd) {
        Ingredient ingredient = getIngredientByName(name);
        ingredient.setQuantityInStorageInKiloGram(ingredient.getQuantityInStorageInKiloGram() + quantityToAdd);
    }

    private Ingredient getIngredientByName(String name) {
        for (Ingredient ingredient1 : allIngredients) {
            if (ingredient1.getName() == name) {
                return ingredient1;
            }
        }
        return null;
    }

    @Override
    protected Ingredient[] addToArray(Object newIngredient, Object[] localIngredientList) {
        Ingredient[] newList = (Ingredient[])super.addToArray(newIngredient,localIngredientList);
        return newList;
    }
}
