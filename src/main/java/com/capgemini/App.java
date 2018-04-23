package com.capgemini;

import com.capgemini.model.*;

import static com.capgemini.helpers.Dummy.generateDummyData;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        generateDummyData();
        Table table = new Table(1);
        Order order = new Order();
    }


}


