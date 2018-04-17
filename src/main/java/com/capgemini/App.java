package com.capgemini;

import com.capgemini.Model.*;

import java.util.HashMap;

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
        MenuCard menuCard = new MenuCard();
        Ingredient cheese = new Ingredient("cheese", 1,10);
        Ingredient meat = new Ingredient("meat",1,10);
        Ingredient dough = new Ingredient("dough",1,10);
        Ingredient lettuce = new Ingredient("lettuce", 1,10);
        Ingredient tomato = new Ingredient("tomato", 1,10);
        Ingredient chocolate = new Ingredient("chocolate", 1,10);
        Ingredient apple = new Ingredient("apple", 1,10);
        Ingredient salmon = new Ingredient("salmon",3,10);
        Ingredient sugar = new Ingredient("sugar",0.10,10);
        Ingredient rice = new Ingredient("rice",0.20,10);

        HashMap<Ingredient, Integer> ingredientLasagne = new HashMap<Ingredient,Integer>();
        ingredientLasagne.put(cheese,10);
        ingredientLasagne.put(meat,100);
        ingredientLasagne.put(dough,50);

        HashMap<Ingredient,Integer> ingredientSalade = new HashMap<Ingredient,Integer>();
        ingredientSalade.put(lettuce,10);
        ingredientSalade.put(tomato,10);

        HashMap<Ingredient,Integer> ingredientSalmon = new HashMap<Ingredient,Integer>();
        HashMap<Ingredient,Integer> ingredientSoep = new HashMap<Ingredient,Integer>();
        HashMap<Ingredient,Integer> ingredientPasta = new HashMap<Ingredient,Integer>();
        HashMap<Ingredient,Integer> ingredientSpagetti = new HashMap<Ingredient,Integer>();
        HashMap<Ingredient,Integer> ingredientIjs = new HashMap<Ingredient,Integer>();
        HashMap<Ingredient,Integer> ingredientTaart = new HashMap<Ingredient,Integer>();

        Drink cola = new Drink(1, "cola", EFoodType.Drink, 3);
        Drink fanta = new Drink(2, "fanta", EFoodType.Drink, 3);
        Drink sprite = new Drink(3, "sprite", EFoodType.Drink, 3);
        Dish salmonDish = new Dish(25, "Karamel Salmon",EFoodType.Main,6,false,ingredientSalmon);
        Dish salade = new Dish(4, "salade", EFoodType.Starter, 3, true, ingredientSalade);
        Dish soep = new Dish(5, "soep", EFoodType.Starter, 3, true, ingredientSoep);
        Dish lasagne = new Dish(6, "lasagne", EFoodType.Main, 3, true, ingredientLasagne);
        Dish pasta = new Dish(7, "pasta",EFoodType.Main, 3, false, ingredientPasta);
        Dish spagetti = new Dish(8, "spagetti", EFoodType.Main, 3, true, ingredientSpagetti);
        Dish ijs = new Dish(9, "ijs", EFoodType.Dessert, 3, true,ingredientIjs);
        Dish taart = new Dish(10, "taart", EFoodType.Dessert, 3, true, ingredientTaart);
        MenuItem[] menu1Items = {salade, pasta,taart};
        MenuItem[] menu2Items = {soep, lasagne,ijs };
        MenuItem[] menu3Items = {salade, pasta, cola, taart};
        CompoundMenu compoundMenu1 = new CompoundMenu(11, "Compound Menu 1", EFoodType.Menu, 3, false, menu1Items);
        CompoundMenu compoundMenu2 = new CompoundMenu(12, "Compound Menu 2", EFoodType.Menu, 3, true, menu2Items);
        CompoundMenu compoundMenu3 = new CompoundMenu(13, "Compound Menu 3", EFoodType.Menu,7.5,true,menu3Items);
        //String [] ingredientString ={"pasta", "salt"};
        //lasagne.setIngredient(ingredientString);

        menuCard.addMenuItemToMenuCard(cola);
        menuCard.addMenuItemToMenuCard(fanta);
        menuCard.addMenuItemToMenuCard(soep);
        menuCard.addMenuItemToMenuCard(lasagne);
        menuCard.addMenuItemToMenuCard(ijs);
        menuCard.addMenuItemToMenuCard(compoundMenu1);
        menuCard.addMenuItemToMenuCard(compoundMenu3);


        menuCard.generateMenuCard();




    }




}


