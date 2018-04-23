package com.capgemini.controller;

import com.capgemini.model.*;

import com.capgemini.view.MenuItemView;


public class MenuItemController extends BaseController {
    private MenuItem[] allMenuItems;
    private MenuItemView view = new MenuItemView();

    public MenuItemController() {
    }

    private void updateView(){
        view.showAllAvailableItemsWithDetails(this.allMenuItems);
    }

    public void getMenuItemList(){
        updateView();
    }

    public void regMenu(MenuItem... submittedItems) {
        for(MenuItem submittedItem : submittedItems) {
            if (arrayContainsItemByName(submittedItem.getName(), allMenuItems)) {
                System.out.println("There already exists an item with the name" + submittedItem.getName());
                //TODO: what should happen if we already have a dish with the same name
            } else {
                allMenuItems = addToArray(submittedItem, allMenuItems);
            }
        }
    }

    @Override
    protected MenuItem[] addToArray(Object localMenuItem, Object[] localMenuItemList) {
        allMenuItems = (MenuItem[])super.addToArray(localMenuItem, localMenuItemList);
        return allMenuItems;
    }

}