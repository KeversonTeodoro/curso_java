package enumeracoes.Application;

import enumeracoes.model.Order;
import enumeracoes.model_enums.OrderStatus;

import java.util.Date;

public class EnumeracaoApplication {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        OrderStatus orderStatus = OrderStatus.DELIVERED;
        OrderStatus orderStatus2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(order);
        System.out.println(orderStatus);
        System.out.println(orderStatus2);



    }
}
