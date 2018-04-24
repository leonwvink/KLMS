package com.capgemini.KLMS_SPRINGBOOT.model;

public enum EFoodType {
    Starter("Starter"),
    Main("Main Dishes"),
    Dessert("Desserts"),
    Menu("Compound Menus"),
    Drink("Drinks");

    private String type;


    EFoodType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
