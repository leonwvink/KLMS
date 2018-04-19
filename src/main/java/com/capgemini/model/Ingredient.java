package com.capgemini.model;

public class Ingredient extends NamedItem {

    private double pricePerGram;
    private int quantityInStorageInKiloGram;


    public Ingredient(String name, double pricePerGram, int quantityInStorageInKiloGram) {
        super(name);
        this.pricePerGram = pricePerGram;
        this.quantityInStorageInKiloGram = quantityInStorageInKiloGram;
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
