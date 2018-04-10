package com.capgemini.Model;

public class MenuItem {

    private int itemNumber;
    private String name;
    private int foodType; // starter, main, dessert, Drink, combined menu
    private double price;
    private String[] ingredient = new String[5];


    public MenuItem(int itemNumber, String name, int foodType, double price, boolean veggy) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.foodType = foodType;
        this.price = price;
        this.ingredient = ingredient;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoodType() {
        return foodType;
    }

    public void setFoodType(int foodType) {
        this.foodType = foodType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String[] getIngredient() {
        return ingredient;
    }

    public void setIngredient(String[] ingredient) {
        this.ingredient = ingredient;
    }
}
