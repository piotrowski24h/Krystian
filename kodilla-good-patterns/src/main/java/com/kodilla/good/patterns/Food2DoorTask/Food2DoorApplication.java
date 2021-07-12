package com.kodilla.good.patterns.Food2DoorTask;


import java.util.ArrayList;
import java.util.List;//Producer
//1, 2, 3 kazdy z producerow implementuje process na swoj sposob: np. znizka itd.
//Skladanie zamowien: co chcemy wybierac:
// produkt, od ktorego producenta, ilosc
//request
//


public class Food2DoorApplication {

    public static void main (String[] args) {
        Product apple = new Product("apple", 2.0);
        Product orange = new Product("orange", 3.0);
        Product banana = new Product("banana", 4.0);

        List<Product> productList1 = new ArrayList<>();
        productList1.add(apple);
        productList1.add(orange);

        ExtraFoodShop extraFoodShop = new ExtraFoodShop(productList1);

        boolean orderSuccess1 = extraFoodShop.process(apple, 1);
        boolean orderSuccess2 = extraFoodShop.process(orange, 1);
        boolean orderSuccess3 = extraFoodShop.process(banana, 1);

        System.out.println("Order 1 succedded " + orderSuccess1);
        System.out.println("Order 2 succedded " + orderSuccess2);
        System.out.println("Order 3 succedded " + orderSuccess3);
    }
}
