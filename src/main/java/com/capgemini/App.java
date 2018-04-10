package com.capgemini;

import com.capgemini.Model.Menu;
import com.capgemini.Model.MenuItem;
import com.capgemini.Model.Order;
import com.capgemini.Model.Table;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Table table = new Table(1);
        Order order = new Order();
        makeMenuData();


    }


    public static void makeMenuData(){
        MenuItem cola = new MenuItem(1, "cola", 1,3, true);
        MenuItem fanta = new MenuItem(2, "fanta", 1,3, true);
        MenuItem sprite = new MenuItem(3, "sprite", 1,3, true);
        MenuItem salade = new MenuItem(4, "salade", 2,3, true);
        MenuItem soep = new MenuItem(5, "soep", 2,3, true);
        MenuItem lasagne = new MenuItem(6, "lasagne", 3,3, false);
        MenuItem pasta = new MenuItem(7, "pasta", 3,3, false);
        MenuItem spagetti = new MenuItem(8, "spagetti", 3,3, true);
        MenuItem ijs = new MenuItem(9, "ijs", 4,3, true);
        MenuItem taart = new MenuItem(10, "taart", 4,3, true);
        MenuItem menu1 = new MenuItem(11, "salade, pasta, taart", 5,3, false);
        MenuItem menu2 = new MenuItem(12, "soep, lasagne, ijs", 5,3, true);

        Menu drink = new Menu("Drinks", 1);
        Menu starter = new Menu("Starters", 2);
        Menu Main = new Menu("Main", 3);
        Menu Dessert = new Menu("Desserts", 4);
        Menu Combo = new Menu("Action Menus", 5);

        drink.setMenuItems([cola, fanta, sprite], );
    }


}
