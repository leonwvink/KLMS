package models;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Table table;
    private int id;
    private Date orderTime;
    private ArrayList<Drinks> orderedDrinks;
    private ArrayList<?> orderedFood; // The food is split into dishes and menus
}
