package com.kodilla.good.patterns.order;

import java.time.LocalDateTime;

public interface OrderReprository {
    boolean createOrder (User user, LocalDateTime from,LocalDateTime to);
}
