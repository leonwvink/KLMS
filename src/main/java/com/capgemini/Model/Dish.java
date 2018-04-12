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

    @Override
    public void printMenuDetails() {            //THIS FUNCTION ASSUMES THAT INGREDIENTS ARE INPUT AS A STRING
        super.printMenuDetails();
        if (ingredient != null) {
            System.out.format("%23s",  "Ingredients: ");
            for (int i = 0; i < this.ingredient.length-1; i++) {
                System.out.print(this.ingredient[i] + ", ");
            }
            System.out.print(this.ingredient[this.ingredient.length - 1]);
            System.out.println(" ");
        }
    }
}
