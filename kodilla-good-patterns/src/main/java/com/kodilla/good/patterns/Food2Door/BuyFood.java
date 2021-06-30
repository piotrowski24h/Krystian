package com.kodilla.good.patterns.Food2Door;

public class BuyFood {
    public Product product;
    public boolean processed;


public BuyFood(final Product product, final boolean processed){
    this.product = product;
    this.processed = processed;
}

    public Product getProduct() {
        return product;
    }
    public boolean isProcessed() {
        return processed;
    }

    public void processed() {
    }
}

