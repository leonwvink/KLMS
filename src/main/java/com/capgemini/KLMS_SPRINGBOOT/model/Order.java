package com.capgemini.KLMS_SPRINGBOOT.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

public class Order {
    private int table;
    private static AtomicLong id;
    private Timestamp orderTime;
    private ArrayList<OrderItem> orderItemList;

    public Order(int table,  ArrayList<OrderItem> orderItemList) {
        this.table = table;
        this.id = id;
        this.orderTime = new Timestamp(System.currentTimeMillis());
        this.orderItemList = orderItemList;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public AtomicLong getId() {
        return id;
    }

    private void setId(AtomicLong id) {
        this.id = id;
    }

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public static long generateUniqueItemNumber()
    {
        return id.getAndIncrement();
    }

}
