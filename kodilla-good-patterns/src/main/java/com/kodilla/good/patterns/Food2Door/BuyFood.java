package com.kodilla.good.patterns.Food2Door;

import java.util.Objects;

public class BuyFood {
    public OldProduct product;
    public boolean process;


public BuyFood(final OldProduct product, final boolean process){
    this.product = product;
    this.process = process;
}

    public OldProduct getProduct() {
        return product;
    }
    public boolean isProcess() {
        return process;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BuyFood)) return false;
        BuyFood buyFood = (BuyFood) o;
        return process == buyFood.process && product.equals(buyFood.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, process);
    }
}

