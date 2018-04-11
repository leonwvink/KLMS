package com.capgemini.Model;

public class Menu extends MenuItem {
    private MenuItem[] menuItems;


    public Menu(int itemNumber, String name, EFoodType foodType, double price) {
        super(itemNumber, name, foodType, price);
    }


    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }
}
