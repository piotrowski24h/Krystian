package com.kodilla.good.patterns.Food2DoorTask;


import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Producer {
    private List<Product> productList = new ArrayList<>();

    public ExtraFoodShop(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public boolean process(Product productToOrder, int quantity) {
        String productName = productToOrder.getName();

        for (Product product : productList) {
            if (product.getName().equals(productName)) {
                return true;
            }
        }

        return false;
    }
}
