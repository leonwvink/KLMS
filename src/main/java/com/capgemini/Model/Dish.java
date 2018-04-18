package com.capgemini.Model;

import java.util.HashMap;

public class Dish extends MenuItem {

    private Ingredient[] ingredient; //ingredientsWithItsWeightInRecipe.keySet.toArray(of type ingredient with the right length) see line 16
    private boolean veg;
    private HashMap<Ingredient,Integer> ingredientsWithItsWeightInRecipe;
//    HashMap<Key, Value>

    public Dish(int itemNumber, String name, EFoodType foodType, double price, boolean veg, HashMap<Ingredient,Integer> IngredientsWithItsWeightInRecipe) {
        super(itemNumber, name, foodType, price);
        this.veg = veg;
        this.ingredientsWithItsWeightInRecipe =IngredientsWithItsWeightInRecipe;
        this.ingredient=IngredientsWithItsWeightInRecipe.keySet().toArray(new Ingredient[ingredientsWithItsWeightInRecipe.keySet().size()]);
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

    public void dishCostPrice(){
        double temporary = 0.0;
        for (int c = 0 ; c < ingredient.length; c++){
            temporary = temporary + ingredient[c].getPrice();

        }
        super.setPrice(temporary);
        System.out.println(temporary);
    }


    @Override
    public void printMenuDetails() {            //THIS FUNCTION ASSUMES THAT INGREDIENTS ARE INPUT AS A STRING
        super.printMenuDetails();
        if (ingredient != null && ingredient.length != 0) {
            System.out.format("%23s",  "Ingredient: ");
            for (int i = 0; i < this.ingredient.length-1; i++) {
                System.out.print(this.ingredient[i].getName() + ", ");
            }
            System.out.print(this.ingredient[this.ingredient.length - 1].getName());
            System.out.println(" ");
        }
    }
}
