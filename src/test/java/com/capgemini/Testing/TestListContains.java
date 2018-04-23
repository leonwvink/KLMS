package com.capgemini.Testing;

import com.capgemini.Model.*;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestListContains {
    private static MenuItem[] menuItems;
    private static MenuCard testMenuCard;
    private static MenuItem testStarterEmptyIngredients;
    private static MenuItem testStarterFilledIngredients;
    private static MenuItem testMainFilledIngredients;
    private static MenuItem testDrink;
    private static MenuItem testCombinedMenu;
    private static MenuItem testEmptyCombinedMenu;
    private static MenuItem[] testDishList;

    @BeforeClass
    public static void setup() {
        testMenuCard = new MenuCard();
        Ingredient testIngredient1 = new Ingredient("testIngredient1", 1);
        Ingredient testIngredient2 = new Ingredient("testIngredient2", 2);
        Ingredient[] testIngredientEmptyList = {};
        Ingredient[] testIngredientFilledList = {testIngredient1, testIngredient2};
        testStarterEmptyIngredients = new Dish(1, "testDish", EFoodType.Starter, 1, false, testIngredientEmptyList);
        testStarterFilledIngredients = new Dish(2, "testDish2", EFoodType.Starter, 1, false, testIngredientFilledList);
        testMainFilledIngredients = new Dish(3, "TestDish3", EFoodType.Main, 1, false, testIngredientFilledList);
        testDrink = new Drink(4, "testDrink", EFoodType.Drink, 2);
        MenuItem[] testDishListEmpty = {};
        testDishList = new MenuItem[]{testMainFilledIngredients, testStarterEmptyIngredients, testDrink};
        testCombinedMenu = new CompoundMenu(5, "TestMenu1", EFoodType.Menu, 1, false, testDishList);
        testEmptyCombinedMenu = new CompoundMenu(6, "TestMenu2", EFoodType.Menu, 1, false, testDishListEmpty);
    }

    @Test
    public void testListContainsForEmptyList() {
        boolean result = testMenuCard.listContains(testStarterEmptyIngredients, menuItems);
        assertEquals(false, result);
    }

    @Test
    public void testListContainsForFilledListButNewItem() {
        boolean result = testMenuCard.listContains(testStarterFilledIngredients, testDishList);
        assertEquals(false, result);
    }

    @Test
    public void testListContainsForFilledListWithExistingItem() {
        boolean result = testMenuCard.listContains(testMainFilledIngredients, testDishList);
        assertEquals(true, result);
    }
}
