package com.capgemini.Model;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Print {

    private MenuItem[] menuCardList;
    private int table = 1;
    private int id;
    private Timestamp orderTime;
    private ArrayList<OrderItem> orderItemList = new ArrayList<>();

    public void generateOrder() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        System.out.println("Order from table " + table + " | " + timestamp);
        System.out.println("______________ ");
        System.out.println(" ");
        for (OrderItem item : orderItemList) {
            item.printDetails();
            System.out.println("______________ ");
        }
    }

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
}
