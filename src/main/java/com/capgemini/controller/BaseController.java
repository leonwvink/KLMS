package com.capgemini.controller;

import com.capgemini.model.NamedItem;

public class BaseController {

    protected Object[] addToArray(Object newObject, Object[] localObjectList) {
        Object[] newList;
        if (localObjectList == null) {          //it it is empty we will need a new list
            newList = new Object[1];
            newList[0] = newObject;
        } else {
            newList = new Object[localObjectList.length + 1]; //We will make the list one element longer
            for (int i = 0; i < localObjectList.length; i++) { //copy the old list to the new list
                newList[i] = localObjectList[i];
            }
            newList[newList.length - 1] = newObject; // add the new item to the list
        }
        return newList;
    }

    protected boolean arrayContainsItemByName(String name, NamedItem[] array){
        if (array == null) {
            return false;
        }
        for (NamedItem arrayItem : array) {
            if (arrayItem.getName() == name) {
                return true;
            }
        }
        return false;
    }

}
