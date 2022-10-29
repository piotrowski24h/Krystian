package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop implements Producer {


    @Override
    public boolean process(OldProduct product, double price) {
        return false;
    }
}
