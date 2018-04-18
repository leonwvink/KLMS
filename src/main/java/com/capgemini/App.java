package com.capgemini;

import com.capgemini.Controller.MenuCardController;
import com.capgemini.Model.*;
import com.capgemini.View.MenuCard;

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
        Ingredient cheese = new Ingredient("cheese", 1);
        Ingredient meat = new Ingredient("meat",1);
        Ingredient dough = new Ingredient("dough",1);
        Ingredient lettuce = new Ingredient("lettuce", 1);
        Ingredient tomato = new Ingredient("tomato", 1);
        Ingredient chocolate = new Ingredient("chocolate", 1);
        Ingredient apple = new Ingredient("apple", 1);
        Ingredient salmon = new Ingredient("salmon",3);
        Ingredient sugar = new Ingredient("sugar",0.10);
        Ingredient rice = new Ingredient("rice",0.20);
        Ingredient[] ingredientLasagne = {cheese, meat, dough};
        Ingredient[] ingredientSalade = {lettuce, tomato};
        Ingredient[] ingredientSalmon = {salmon,sugar, rice};
        Ingredient[] ingredientSoep = {tomato};
        Ingredient[] ingredientPasta = {cheese, tomato, meat};
        Ingredient[] ingredientSpagetti = {cheese, tomato, dough};
        Ingredient[] ingredientIjs = {chocolate};
        Ingredient[] ingredientTaart = {apple, dough};

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

        MenuCardController menuCardController = new MenuCardController();

        menuCardController.addMenuItemToMenuCard(ijs);




    }




}


