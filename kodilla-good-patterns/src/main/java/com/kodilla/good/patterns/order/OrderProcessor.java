package com.kodilla.good.patterns.order;

public class OrderProcessor {
    private final InformationServic informationServic;
    private final OrderService orderService;
    private final OrderReprository orderReprository;

    public OrderProcessor(final InformationServic informationServic,
                          final OrderService orderService,
                          final  OrderReprository orderReprository) {
        this.informationServic = informationServic;
        this.orderService = orderService;
        this.orderReprository = orderReprository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrder = orderService.order(orderRequest.getUser(),orderRequest.getFrom(),orderRequest.getTo());

        if(isOrder && orderRequest.getUser().getAge() >18) {
            informationServic.inform(orderRequest.getUser());
            orderReprository.createOrder(orderRequest.getUser(), orderRequest.getFrom(), orderRequest.getTo());
            return new OrderDto(orderRequest.getUser(), true);
        }else {
            return new OrderDto(orderRequest.getUser(),false);
        }
    }
}
