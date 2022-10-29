package com.kodilla.good.patterns.order;

import java.time.LocalDateTime;

public interface OrderService {
    boolean order(User user, LocalDateTime from, LocalDateTime to);
}
