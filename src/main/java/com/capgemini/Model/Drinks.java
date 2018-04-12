package com.capgemini.Model;

public class Drinks {
    private String itemName;
    private double itemPrice;
    private boolean available;

    public Drinks(String itemName, double itemPrice, boolean available){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.available = available;

    }

    public void drinkNameChange(String newName){
        this.itemName = newName;
    }


    public void increasePrice(int addition){
        itemPrice = itemPrice + addition;


    }

    public void decreasePrice(int discount){
        itemPrice = itemPrice - discount;

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
