package com.kodilla.good.patterns.order;

import java.time.LocalDateTime;

public class OrderServiceImpl implements OrderService {

    @Override
    public boolean order(User user, LocalDateTime from, LocalDateTime to) {
        return user.getMoney() > 0;
    }
}
