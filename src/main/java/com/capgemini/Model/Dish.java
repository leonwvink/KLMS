package com.capgemini.Model;

public class Dish extends MenuItem {

    private String[] ingredient;
    private boolean veg;


    public Dish(int itemNumber, String name, EFoodType foodType, double price, boolean veg) {
        super(itemNumber, name, foodType, price);
        this.veg = veg;
    }

    public boolean isVeg() {
        return this.veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    public String[] getIngredient() {
        return this.ingredient;
    }

    public void setIngredient(String[] ingredient) {
        this.ingredient = ingredient;
    }
}
