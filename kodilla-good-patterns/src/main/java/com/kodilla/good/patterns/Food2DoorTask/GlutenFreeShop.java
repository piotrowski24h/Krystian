package com.kodilla.good.patterns.Food2DoorTask;


import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Producer {
    private List<Product> productList = new ArrayList<>();

    @Override
    public boolean process(Product product, int quantity) {
        return false;
    }
}
