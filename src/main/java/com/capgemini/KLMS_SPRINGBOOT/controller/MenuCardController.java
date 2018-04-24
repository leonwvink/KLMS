package com.capgemini.KLMS_SPRINGBOOT.controller;

import com.capgemini.KLMS_SPRINGBOOT.model.MenuItem;

public class MenuCardController {
    private MenuItem[] menuCardList;

    public MenuCardController(){}

    public void addMenuItemToMenuCard(MenuItem... menuItems) { //... so we can add one or multiple items
        for (MenuItem menuItem: menuItems) {
            if (listContains(menuItem, this.menuCardList)) {
                System.out.println(menuItem.getName() + " was already on the Menu card");
            } else {
                MenuItem[] newList = addMenuItemToList(menuItem, this.menuCardList);
                this.menuCardList = newList;
            }
        }
    }

    public void removeMenuItemFromMenuCard(MenuItem menuItem) {
        if (listContains(menuItem, this.menuCardList)) {
            MenuItem[] newList = new MenuItem[this.menuCardList.length - 1];
            int i = 0;
            for (MenuItem item : menuCardList) {
                if (!(item.equals(menuItem))) {
                    newList[i] = item;
                    i++;
                }
            }
            this.menuCardList = newList;
        }
    }

    private boolean listContains(MenuItem menuItem, MenuItem[] itemList) {
        if (itemList == null) {
            return false;
        }
        for (MenuItem item : itemList) {
            if (item.equals(menuItem)) {
                return true;
            }
        }
        return false;
    }

    private MenuItem[] addMenuItemToList(MenuItem menuItem, MenuItem[] localList) {
        MenuItem[] newList;
        if (localList == null) {          //it it is empty we will need a new list
            newList = new MenuItem[1];
            newList[0] = menuItem;
        } else {
            newList = new MenuItem[localList.length + 1]; //We will make the list one element longer
            for (int i = 0; i < localList.length; i++) { //copy the old list to the new list
                newList[i] = localList[i];
            }
            newList[newList.length - 1] = menuItem; // add the new item to the list
        }
        return newList;

    }

}
