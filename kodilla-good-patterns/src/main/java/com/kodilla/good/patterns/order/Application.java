package com.kodilla.good.patterns.order;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {
        InformationServic informationServic = new InformationServiceImpl2();
        OrderService orderService = new OrderServiceImpl();
        OrderReprository orderReprository = new OrderRepositoryImp();

        OrderProcessor orderProcessor = new OrderProcessor(informationServic, orderService, orderReprository);

        User validUser = new User("Kamir","Benzema",33,120 );
        User underAgeUser = new User("Wiktoria","Gabor",15,200);
        User noMoneyUser = new User( "Mój","Szef",33,0);

        OrderRequest validOrderRequest = new OrderRequest(validUser, LocalDateTime.now(),LocalDateTime.now().plusDays(1));
        OrderRequest invalidRequest = new OrderRequest(underAgeUser,LocalDateTime.now(), LocalDateTime.now().plusDays(1));
        OrderRequest invalidRequest2 = new OrderRequest(noMoneyUser, LocalDateTime.now(), LocalDateTime.now().plusDays(1));

        OrderDto orderDto = orderProcessor.process(validOrderRequest);
        OrderDto orderDto1 = orderProcessor.process(invalidRequest);
        OrderDto orderDto2 = orderProcessor.process(invalidRequest2);

        System.out.println("Order status:");
        System.out.println("Order for user"+ orderDto.getUser() + "processed" + orderDto.isProcessed());
        System.out.println("Order for user"+ orderDto1.getUser() +" processed: " + orderDto1.isProcessed());
        System.out.println("Order for user"+ orderDto2.getUser() +" processed: " + orderDto2.isProcessed());
    }
    }

