package com.capgemini.Model;

import java.lang.reflect.Array;

public class Dish extends MenuItem {

    private Ingredient[] ingredient;
    private boolean veg;


    public Dish(int itemNumber, String name, EFoodType foodType, double price, boolean veg, Ingredient[] ingredient) {
        super(itemNumber, name, foodType, price);
        this.veg = veg;
        this.ingredient = ingredient;
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
    public void printMenuDetails() {            //THIS FUNCTION ASSUMES THAT INGREDIENTS ARE INPUT AS A STRING
        super.printMenuDetails();
        if (ingredient != null) {
            System.out.format("%23s",  "Ingredient: ");
            for (int i = 0; i < this.ingredient.length-1; i++) {
                System.out.print(this.ingredient[i].getName() + ", ");
            }
            System.out.print(this.ingredient[this.ingredient.length - 1].getName());
            System.out.println(" ");
        }
    }
}
