package com.capgemini.Model;

public class MenuCard {
    private MenuItem[] menuCardList;

    public void generateMenuCard(){
        System.out.println("Menu <Name of Restaurant>");
        System.out.println(" ");

    }
    public void addMenuItemToMenuCard(MenuItem menuItem){
        if (menuCardList == null){
            this.menuCardList = new MenuItem[1];
            this.menuCardList[0]= menuItem;
        } else if (!listContains(menuItem, this.menuCardList)){
            MenuItem [] newList = addMenuItemToList(menuItem, this.menuCardList);
        } else {
            System.out.println(menuItem.getName() + "was already on the Menucard");
        }
    }

    public void removeMenuItemFromMenuCard(MenuItem menuItem){
        if (listContains(menuItem, this.menuCardList)){
            MenuItem[] newList = new MenuItem[this.menuCardList.length -1];
            int i =0;
            for (MenuItem item: menuCardList){
                if(!(item.equals(menuItem))){
                    newList[i] = item;
                    i++;
                }
            }
            this.menuCardList = newList;
        }
    }

    public boolean listContains(MenuItem menuItem, MenuItem[] itemList){
        for(MenuItem item: itemList){
            if(item.equals(menuItem)) {
                return true;
            }
        }
        return false;
    }

    private MenuItem[] addMenuItemToList(MenuItem menuItem, MenuItem[] localList){
        MenuItem[] newList = new MenuItem[localList.length+1];
        for(int i = 0; i<localList.length; i++){ //copy the old list to the new list
            newList[i]= localList[i];
        }
        newList[newList.length-1] =menuItem; // add the new item to the list
        return newList;
    }
}
