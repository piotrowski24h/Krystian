package com.kodilla.stream;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();


        order.add(new Product (1,"Yellow T-shirt"));
        order.add(new Product(1,"Yellow T-shirt"));
        order.add(new Product(2,"Green T-shirt"));


        for (Product product : order.getList()) {
            System.out.println(product);
        }
    }



}
