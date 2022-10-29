package com.kodilla.good.patterns.rental;

import java.time.LocalDateTime;

public class RentalServiceImpl implements RentalService {

    @Override
    public boolean rent(User user, LocalDateTime from, LocalDateTime to) {
        return user.getMoney() > 0;
    }
}
