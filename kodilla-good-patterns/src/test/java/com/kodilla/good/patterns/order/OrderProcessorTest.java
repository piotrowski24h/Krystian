package com.kodilla.good.patterns.order;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderProcessorTest {
 @Test
    public void testOrderProccesor() {
     //Given
     InformationServic informationServic = new InformationServiceImpl2();
     OrderService orderService = new OrderServiceImpl();
     OrderReprository orderReprository = new OrderRepositoryImp();

     OrderProcessor orderProcessor = new OrderProcessor(informationServic, orderService, orderReprository);

     User validUser = new User( "Jan","kowalski", 35,100);
     User underAgeUser = new User("John","Newman", 17,200);
     User noMoneyUser = new User("Donald","Tusk",50,0);

     OrderRequest validOrderRequest = new OrderRequest(validUser,LocalDateTime.now(), LocalDateTime.now().plusDays(1));
     OrderRequest inValidOrderRequest = new OrderRequest(underAgeUser,LocalDateTime.now(), LocalDateTime.now().plusDays(1));
     OrderRequest inValidOrderRequest1 = new OrderRequest(noMoneyUser, LocalDateTime.now(),LocalDateTime.now().plusDays(2));

     OrderDto orderDto = orderProcessor.process(validOrderRequest);
     OrderDto orderDto1 = orderProcessor.process(inValidOrderRequest);
     OrderDto orderDto2 = orderProcessor.process(inValidOrderRequest1);
     //then
     assertTrue(orderDto.isProcessed());
     assertFalse(orderDto1.isProcessed());
     assertFalse(orderDto2.isProcessed());



         }
     }




