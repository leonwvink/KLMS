package com.capgemini.controller;

import com.capgemini.model.OrderItem;
import com.capgemini.model.Order;
import java.util.ArrayList;

public class OrderController {
    private ArrayList<Order> orderList = new ArrayList<>();


    public void addToOrder(OrderItem item, Order order) {
        if (order.getOrderItemList().isEmpty()) {
            ArrayList <OrderItem> initalizeOrder = new ArrayList<>();
            initalizeOrder.add(item);
            order.setOrderItemList(initalizeOrder);
        } else {
            for (OrderItem type : order.getOrderItemList()) {
                if (type.getMenuitem() == item.getMenuitem()) {
                    type.setQuantity(type.getQuantity() + 1);
                } else {
                    ArrayList<OrderItem> neworderItemList = order.getOrderItemList();
                    neworderItemList.add(item);
                    order.setOrderItemList(neworderItemList);
                }
            }


        }
    }
}
