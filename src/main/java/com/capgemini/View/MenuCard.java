package com.capgemini.View;

import com.capgemini.Model.EFoodType;
import com.capgemini.Model.MenuItem;

public class MenuCard {

    public void generateMenuCard(MenuItem[] menuItems) {
        System.out.println("Menu <Name of Restaurant>");
        System.out.println(" ");
        for (EFoodType type : EFoodType.values()) {
            System.out.println(type.getType());
            for(MenuItem item: menuItems){
                if (type == item.getFoodType()) {
                    item.printMenuDetails();
                    System.out.println(" ");
                }
            }
        }
    }

}
