package com.capgemini.KLMS_SPRINGBOOT.model;

public class CompoundMenu extends MenuItem{
    private MenuItem[] menuItems;
    private boolean veg;

    public CompoundMenu(String name, EFoodType foodType, double price, boolean veg, MenuItem[] menuItems) {
        super(name, foodType, price);
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
    public String toString(){
        String compoundMenuInfo = super.toString();
        if (this.menuItems != null) {
            compoundMenuInfo= compoundMenuInfo + String.format("%23s","Consists of: "); //23 is 13 + 10 so it will start at the right place (13 is number of characters in Consists of:
            for (int i = 0; i < this.menuItems.length-1; i++) {
                compoundMenuInfo= compoundMenuInfo+ String.format(this.menuItems[i].getName() + ", ");
            }
            compoundMenuInfo = compoundMenuInfo + String.format(this.menuItems[this.menuItems.length - 1].getName())+ System.lineSeparator();
        }
        return compoundMenuInfo;
    }
}
