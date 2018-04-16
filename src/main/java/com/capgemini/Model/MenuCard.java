package com.capgemini.Model;

public class MenuCard {
    private MenuItem[] menuCardList;

    public void generateMenuCard() {
        System.out.println("Menu <Name of Restaurant>");
        System.out.println(" ");
        for (EFoodType type : EFoodType.values()) {
            System.out.println(type.getType());
            for(MenuItem item: this.menuCardList){
                if (type == item.getFoodType()) {
                    item.printMenuDetails();
                    System.out.println(" ");
                }
            }
        }
    }

    public void addMenuItemToMenuCard(MenuItem menuItem) {
        if (listContains(menuItem, this.menuCardList)) {
            System.out.println(menuItem.getName() + " was already on the Menucard");
        } else {
            MenuItem[] newList = addMenuItemToList(menuItem, this.menuCardList);
            this.menuCardList = newList;
            // System.out.println(menuItem.getName() + "is added to the Menu card");
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

    public boolean listContains(MenuItem menuItem, MenuItem[] itemList) {
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
