package com.kodilla.good.patterns.order;

import java.time.LocalDateTime;

public class OrderRepositoryImp implements  OrderReprository {

    @Override
    public boolean createOrder(User user, LocalDateTime from, LocalDateTime to){
    //check user if is allowed to create order - based on age
        return user.getAge()>18;
}
}
