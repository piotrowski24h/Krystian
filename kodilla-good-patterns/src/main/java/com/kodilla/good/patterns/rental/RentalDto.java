package com.kodilla.good.patterns.rental;

public class RentalDto {
    public User user;
    public boolean processed;

    public RentalDto(final User user, final boolean processed ) {
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
