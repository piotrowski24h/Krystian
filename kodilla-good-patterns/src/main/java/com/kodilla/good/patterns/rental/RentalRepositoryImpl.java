package com.kodilla.good.patterns.rental;

import java.time.LocalDateTime;

public class RentalRepositoryImpl implements RentalRepository{

    @Override
    public boolean createRental(User user, LocalDateTime from, LocalDateTime to) {

        //check if user is allowed to create rental - based on age
        return user.getAge() > 18;
    }
}
