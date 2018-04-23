package com.capgemini.model;

import java.sql.Timestamp;
import java.util.ArrayList;


public class Order {

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


    public void addToOrder(OrderItem item) {
        if (orderItemList.isEmpty()) {
            orderItemList.add(item);
        } else {
            for (OrderItem type : orderItemList) {
                if (type.getMenuitem() == item.getMenuitem()) {
                    type.setQuantity(type.getQuantity() + 1);
                } else {
                    orderItemList.add(item);
                }
            }


        }
    }
}
