package com.cursojava.secao12.enumerator;

import com.cursojava.secao12.enumerator.entites.Order;
import com.cursojava.secao12.enumerator.entites.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);

        System.out.println(order);

        // Conversão de String para Enum:
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }
}
