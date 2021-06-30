package com.kodilla.good.patterns.order;

public class OrderDto {
    public User user;
    public boolean processed;


    public OrderDto(final User user, final boolean processed) {
       this.user = user;
       this.processed = processed;
    }
    public User getUser() {
    return user;
    }

    public boolean isProcessed() {
        return processed;
    }
}

