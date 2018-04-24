package com.capgemini.model;

public class OrderItem {
    private int quantity;
    private MenuItem menuitem;

    public OrderItem(int quantity, MenuItem menuitem) {
        this.quantity = quantity;
        this.menuitem = menuitem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public MenuItem getMenuitem() {
        return menuitem;
    }

    public void setMenuitem(MenuItem menuitem) {
        this.menuitem = menuitem;
    }

    @Override
    public String toString() {
        return String.format("%-2s%-70s \n",getQuantity(), getMenuitem().getName());
    }

    public void printDetails(){
        System.out.format("%-2s%-70s \n",getQuantity(), getMenuitem().getName()); //- means left align, numbers mean characters, the size will fill out completely
    }
}
