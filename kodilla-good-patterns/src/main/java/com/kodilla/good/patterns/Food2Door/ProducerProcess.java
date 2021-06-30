package com.kodilla.good.patterns.Food2Door;

public class ProducerProcess {
    private final Producer producer;

    public ProducerProcess(final Producer producer) {
        this.producer = producer;
    }

    public BuyFood process(final BuyRequest buyRequest) {
        boolean isBuy = producer.process(buyRequest.getProduct(), buyRequest.getPrice());


        if (isBuy && buyRequest.getProduct().getPrice() > 3.50) {
            producer.process(buyRequest.getProduct(), buyRequest.getPrice());
            return new BuyFood(buyRequest.getProduct(), true);
        } else {
            return new BuyFood(buyRequest.getProduct(), false);
        }
    }
}
