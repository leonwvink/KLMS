package com.capgemini.Model;

public enum EFoodType {
    Starter("Starter"),
    Main("Main Dishes"),
    Dessert("Desserts"),
    Menu("Combined Menus"),
    Drink("Drinks");

    private String type;

    EFoodType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
