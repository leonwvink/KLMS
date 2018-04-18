package com.capgemini.Model;

public class Ingredient {

    private String name;
    private double pricePerGram;
    private int quantityInStorageInKiloGram;


    public Ingredient(String name, double pricePerGram, int quantityInStorageInKiloGram) {
        this.name = name;
        this.pricePerGram = pricePerGram;
        this.quantityInStorageInKiloGram = quantityInStorageInKiloGram;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerGram() {
        return this.pricePerGram;
    }

    public void setPricePerGram(double pricePerGram) {
        this.pricePerGram = pricePerGram;
    }

    public int getQuantityInStorageInKiloGram() {
        return quantityInStorageInKiloGram;
    }

    public void setQuantityInStorageInKiloGram(int quantityInStorageInKiloGram) {
        this.quantityInStorageInKiloGram = quantityInStorageInKiloGram;
    }
}
