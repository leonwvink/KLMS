package com.capgemini.Model;

import java.util.Date;

public class Order {
    private Table table;
    private int id;
    private Date orderTime;
    private Drinks[] orderedDrinks;
    private Dish[] orderedDishes;
    private Menu[] orderedMenus;
}
