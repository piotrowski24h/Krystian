package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDateTime;

public class BuyRequest {

    private OldProduct product;
    private  double price;
//    private final LocalDateTime to;


    public BuyRequest(OldProduct product, double price, LocalDateTime to) {
            this.product = product;
            this.price = price;
//            this.to = to;

    }

    public BuyRequest(Object o) {

    }

    public OldProduct getProduct() {
            return product;
        }

    public double getPrice() {
        return price;
    }

//    public LocalDateTime getTo() {
//        return to;
//    }

}

