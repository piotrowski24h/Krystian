package com.kodilla.good.patterns.challenges;

public class RentalDto {
    public User user;
    public boolean RentalDto;

    public RentalDto(final User user, final boolean isAllegro ) {
        this.user = user;
        this.RentalDto= isAllegro;
    }
    public User getUser() {
        return user;
    }

    public boolean isAllegro() {
        return RentalDto;
    }
}
