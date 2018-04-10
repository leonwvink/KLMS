package com.capgemini.Model;

public class Menu {
    private String name;
    private int itemNumber;
    private MenuItem[] menuItems;


    public Menu(String name, int itemNumber) {
        this.name = name;
        this.itemNumber = itemNumber;
        this.menuItems = menuItems;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }


}
