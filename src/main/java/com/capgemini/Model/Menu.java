package com.capgemini.Model;

public class Menu extends MenuItem {
    private MenuItem[] menuItems;
    private boolean veg;

    public Menu(int itemNumber, String name, EFoodType foodType, double price, boolean veg) {
        super(itemNumber, name, foodType, price);
        this.veg = veg;
    }

    public boolean isVeg() {
        return this.veg;
    }

    public void setVeg(boolean veg) {
        this.veg = veg;
    }

    public MenuItem[] getMenuItems() {
        return this.menuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }
}
