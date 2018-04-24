package com.capgemini.KLMS_SPRINGBOOT.controller;

import com.capgemini.KLMS_SPRINGBOOT.model.Ingredient;

public class IngredientController extends BaseController{
    private Ingredient[] allIngredients;

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
        Object[] newList = super.addToArray(newIngredient,localIngredientList);
        Ingredient[] newList2 = new Ingredient[newList.length];
        for(int i=0; i<newList.length; i++){
            newList2[i]=(Ingredient)newList[i];
        }
        return newList2;
    }

}
