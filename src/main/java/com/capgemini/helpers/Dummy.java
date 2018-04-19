package com.capgemini.helpers;

import com.capgemini.controller.IngredientController;
import com.capgemini.controller.MenuCardController;
import com.capgemini.controller.MenuItemController;
import com.capgemini.model.*;

import java.util.HashMap;

public class Dummy {
    public static void generateDummyData(){
        IngredientController ingredientController = new IngredientController();
        ingredientController.registerIngredient("cheese", 0.10, 10);
        ingredientController.registerIngredient("meat",3,100);
        ingredientController.registerIngredient("dough", 0.50, 100);
        ingredientController.registerIngredient("lettuce", 0.50, 5);
        ingredientController.registerIngredient("tomato",0.20,10);
        ingredientController.registerIngredient("chocolate", 1, 100);
        ingredientController.registerIngredient("apple", 0.35, 10);
        ingredientController.registerIngredient("salmon", 4, 80);
        ingredientController.registerIngredient("sugar", 0.01, 10);
        ingredientController.registerIngredient("rice",0.20, 10);

        Ingredient cheese = new Ingredient("cheese", 1, 10);
        Ingredient meat = new Ingredient("meat", 1, 10);
        Ingredient dough = new Ingredient("dough", 1, 10);
        Ingredient lettuce = new Ingredient("lettuce", 1, 10);
        Ingredient tomato = new Ingredient("tomato", 1, 10);
        Ingredient chocolate = new Ingredient("chocolate", 1, 10);
        Ingredient apple = new Ingredient("apple", 1, 10);
        Ingredient salmon = new Ingredient("salmon", 3, 10);
        Ingredient sugar = new Ingredient("sugar", 0.10, 10);
        Ingredient rice = new Ingredient("rice", 0.20, 10);

        HashMap<Ingredient, Integer> ingredientLasagne = new HashMap<Ingredient, Integer>();
        ingredientLasagne.put(cheese, 10);
        ingredientLasagne.put(meat, 100);
        ingredientLasagne.put(dough, 50);

        HashMap<Ingredient, Integer> ingredientSalade = new HashMap<Ingredient, Integer>();
        ingredientSalade.put(lettuce, 10);
        ingredientSalade.put(tomato, 10);

        HashMap<Ingredient, Integer> ingredientSalmon = new HashMap<Ingredient, Integer>();
        HashMap<Ingredient, Integer> ingredientSoep = new HashMap<Ingredient, Integer>();
        HashMap<Ingredient, Integer> ingredientPasta = new HashMap<Ingredient, Integer>();
        HashMap<Ingredient, Integer> ingredientSpagetti = new HashMap<Ingredient, Integer>();
        HashMap<Ingredient, Integer> ingredientIjs = new HashMap<Ingredient, Integer>();
        HashMap<Ingredient, Integer> ingredientTaart = new HashMap<Ingredient, Integer>();

        Drink cola = new Drink("cola", EFoodType.Drink, 3);
        Drink fanta = new Drink( "fanta", EFoodType.Drink, 3);
        Drink sprite = new Drink( "sprite", EFoodType.Drink, 3);
        Dish salmonDish = new Dish("Karamel Salmon", EFoodType.Main, 6, false, ingredientSalmon);
        Dish salade = new Dish("salade", EFoodType.Starter, 3, true, ingredientSalade);
        Dish soep = new Dish("soep", EFoodType.Starter, 3, true, ingredientSoep);
        Dish lasagne = new Dish("lasagne", EFoodType.Main, 3, true, ingredientLasagne);
        Dish pasta = new Dish("pasta", EFoodType.Main, 3, false, ingredientPasta);
        Dish spagetti = new Dish("spagetti", EFoodType.Main, 3, true, ingredientSpagetti);
        Dish ijs = new Dish("ijs", EFoodType.Dessert, 3, true, ingredientIjs);
        Dish taart = new Dish("taart", EFoodType.Dessert, 3, true, ingredientTaart);
        MenuItem[] menu1Items = {salade, pasta, taart};
        MenuItem[] menu2Items = {soep, lasagne, ijs};
        MenuItem[] menu3Items = {salade, pasta, cola, taart};
        CompoundMenu compoundMenu1 = new CompoundMenu("Compound Menu 1", EFoodType.Menu, 3, false, menu1Items);
        CompoundMenu compoundMenu2 = new CompoundMenu("Compound Menu 2", EFoodType.Menu, 3, true, menu2Items);
        CompoundMenu compoundMenu3 = new CompoundMenu("Compound Menu 3", EFoodType.Menu,7.5,true,menu3Items);
        //String [] ingredientString ={"pasta", "salt"};
        //lasagne.setIngredient(ingredientString);

        MenuCardController menuCardController = new MenuCardController();
        MenuItem[] menuCardList = { cola, fanta, salmonDish, soep, lasagne, ijs, spagetti, soep, compoundMenu2,compoundMenu1};
        menuCardController.addMenuItemToMenuCard(menuCardList);

        MenuItemController menuItemController = new MenuItemController();
        MenuItem[] menuItems = {cola, fanta,sprite, salmonDish, salade, soep, lasagne, pasta, spagetti, ijs, taart};
        menuItemController.regMenu(menuItems);
    }
}
