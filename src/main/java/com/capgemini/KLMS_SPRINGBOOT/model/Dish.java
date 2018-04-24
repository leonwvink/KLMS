package com.capgemini.KLMS_SPRINGBOOT.model;

import java.util.HashMap;

public class Dish extends MenuItem {

    private Ingredient[] ingredient; //ingredientsWithItsWeightInRecipe.keySet.toArray(of type ingredient with the right length) see line 16
    private boolean veg;
    private HashMap<Ingredient, Integer> ingredientsWithItsWeightInRecipe;
//    HashMap<Key, Value>

    public Dish(String name, EFoodType foodType, double price, boolean veg, HashMap<Ingredient, Integer> IngredientsWithItsWeightInRecipe) {
        super(name, foodType, price);
        this.veg = veg;
        this.ingredientsWithItsWeightInRecipe = IngredientsWithItsWeightInRecipe;
        this.ingredient = IngredientsWithItsWeightInRecipe.keySet().toArray(new Ingredient[ingredientsWithItsWeightInRecipe.keySet().size()]);
    }

    public boolean isVeg() {
        return this.veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    public Ingredient[] getIngredient() {
        return this.ingredient;
    }

    public void setIngredient(Ingredient[] ingredient) {
        this.ingredient = ingredient;
    }


    @Override
    public String toString() {
        String DishInfo = super.toString();
        if (ingredient != null && ingredient.length != 0) {
            DishInfo = DishInfo + String.format("%22s", "Ingredient: ");
            for (int i = 0; i < this.ingredient.length - 1; i++) {
                DishInfo = DishInfo + String.format(this.ingredient[i].getName() + ", ");
            }
            DishInfo = DishInfo + (this.ingredient[this.ingredient.length - 1].getName()) + System.lineSeparator();
        }
        return DishInfo;
    }
}
