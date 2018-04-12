package com.capgemini.Model;

public class MenuItem {

    private int itemNumber;
    private String name;
    private EFoodType foodType; // starter, main, dessert, Drink, combined menu
    private double price;
    private double advisePrice;


    public MenuItem(int itemNumber, String name, EFoodType foodType, double price) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.foodType = foodType;
        this.price = price;
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

    public EFoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(EFoodType foodType) {
        this.foodType = foodType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printMenuDetails(){
        System.out.format("%-10s%-70s%-2s%-5.2f \n",getItemNumber(), getName(), "€", getPrice());
        //- means left align, numbers mean characters, the size will fill out completly the .2f gives two
        // numbers behind the comma
    }

}
