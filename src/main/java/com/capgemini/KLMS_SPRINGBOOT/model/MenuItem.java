package com.capgemini.KLMS_SPRINGBOOT.model;

import java.util.concurrent.atomic.AtomicLong;

public abstract class MenuItem extends NamedItem{

    private long itemNumber;
    private EFoodType foodType; // starter, main, dessert, Drink, combined menu
    private double price;
    private static AtomicLong idCounter = new AtomicLong();

    public MenuItem(String name, EFoodType foodType, double price) {
        super(name);
        this.itemNumber = generateUniqueItemNumber();
        this.foodType = foodType;
        this.price = price;
    }

    public long getItemNumber() {
        return itemNumber;
    }

    private void setItemNumber(long itemNumber) {
        this.itemNumber = itemNumber;
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

    public static long generateUniqueItemNumber()
    {
        return idCounter.getAndIncrement();
    }

    //It will return a formatted String.
    //- means left align, numbers mean characters, the size will fill out completely the .2f gives two
    // numbers behind the comma
    //Now sout a menuItem it wont return the memoryLocation but this infromation
    @Override
    public String toString() {
        return String.format("%-10s%-70s%-2s%-7.2f",getItemNumber(), getName(), "€", getPrice())+ System.lineSeparator();
    }
}
