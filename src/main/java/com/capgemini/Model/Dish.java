package com.capgemini.Model;

public class Dish extends MenuItem {

    private String[] ingredient;


    public Dish(int itemNumber, String name, EFoodType foodType, double price) {
        super(itemNumber, name, foodType, price);
    }


    public String[] getIngredient() {
        return ingredient;
    }

    public void setIngredient(String[] ingredient) {
        this.ingredient = ingredient;
    }
}
