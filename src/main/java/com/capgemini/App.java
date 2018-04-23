package com.capgemini;

import com.capgemini.model.*;

import static com.capgemini.helpers.Dummy.generateDummyData;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        generateDummyData();
        Table table = new Table(1);
        Order order = new Order();
    }

//    Order order = new Order();
//    OrderItem first = new OrderItem(1, cola);
//    OrderItem second = new OrderItem(1, cola);
//
//        order.addToOrder(first);
//        order.addToOrder(second);
//
//        order.generateOrder();


}


