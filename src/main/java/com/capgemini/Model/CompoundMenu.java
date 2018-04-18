package com.capgemini.Model;

public class CompoundMenu extends MenuItem {
    private MenuItem[] menuItems;
    private boolean veg;

    public CompoundMenu(int itemNumber, String name, EFoodType foodType, double price, boolean veg, MenuItem[] menuItems) {
        super(itemNumber, name, foodType, price);
        this.veg = veg;
        this.menuItems = menuItems;


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


    public void compoundMenuAdvisePrice() {
        double temp = 0.0;
        for (int i = 0; i < menuItems.length; i++) {
            temp = temp + menuItems[i].getPrice();
        }
        super.setPrice(temp);

    }


    @Override
    public void printMenuDetails() {
        super.printMenuDetails();
        if (this.menuItems != null) {
            System.out.format("%23s", "Consists of: "); //23 is 13 + 10 so it will start at the right place (13 is number of characters in Consists of:
            for (int i = 0; i < this.menuItems.length - 1; i++) {
                System.out.print(this.menuItems[i].getName() + ", ");
            }
            System.out.print(this.menuItems[this.menuItems.length - 1].getName());
            System.out.println(" ");
        }
    }
}
