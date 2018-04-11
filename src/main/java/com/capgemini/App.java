package com.capgemini;

import com.capgemini.Model.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Table table = new Table(1);
        Order order = new Order();
        makeMenuData();


    }


    public static void makeMenuData() {
        Drink cola = new Drink(1, "cola", EFoodType.Drink, 3);
        Drink fanta = new Drink(2, "fanta", EFoodType.Drink, 3);
        Drink sprite = new Drink(3, "sprite", EFoodType.Drink, 3);
        Dish salade = new Dish(4, "salade", EFoodType.Starter, 3, true);
        Dish soep = new Dish(5, "soep", EFoodType.Starter, 3, true);
        Dish lasagne = new Dish(6, "lasagne", EFoodType.Main, 3, true);
        Dish pasta = new Dish(7, "pasta",EFoodType.Main, 3, false);
        Dish spagetti = new Dish(8, "spagetti", EFoodType.Main, 3, true);
        Dish ijs = new Dish(9, "ijs", EFoodType.Dessert, 3, true);
        Dish taart = new Dish(10, "taart", EFoodType.Dessert, 3, true);
        Menu menu1 = new Menu(11, "salade, pasta, taart", EFoodType.Menu, 3, false);
        Menu menu2 = new Menu(12, "soep, lasagne, ijs", EFoodType.Menu, 3, true);

        System.out.println("The "+ cola.getFoodType().getType() + " " + cola.getName() + " costs " + cola.getPrice());
    }




}


