package com.capgemini.view;

import com.capgemini.model.Order;
import com.capgemini.model.OrderItem;

import java.sql.Timestamp;

public class OrderView {

    public void generateOrder(Order order) {
        System.out.println("Order from table " + order.getTable() + " | " + order.getOrderTime());
        System.out.println("______________ ");
        System.out.println(" ");
        for (OrderItem item : order.getOrderItemList()) {
            item.printDetails();
            System.out.println("______________ ");
        }
    }

}
