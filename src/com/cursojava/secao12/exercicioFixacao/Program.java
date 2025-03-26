package com.cursojava.secao12.exercicioFixacao;

import com.cursojava.secao12.exercicioFixacao.entities.Client;
import com.cursojava.secao12.exercicioFixacao.entities.Order;
import com.cursojava.secao12.exercicioFixacao.entities.OrderItem;
import com.cursojava.secao12.exercicioFixacao.entities.Product;
import com.cursojava.secao12.exercicioFixacao.entities.enums.OrderStatus;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfMoment = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String clientName = sc.next();

        System.out.print("E-mail: ");
        String clientEmail = sc.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirth = sdf.parse(sc.next());

        Client client = new Client(clientName,clientEmail,clientBirth);

        System.out.println("Enter Order Data: ");

        System.out.print("Status: ");
        String orderSatus = sc.next();

        System.out.print("How Many Items to this Order: ");
        int n = sc.nextInt();

        Order order = new Order(sdfMoment.parse("20/04/2018 11:25:09"),OrderStatus.valueOf(orderSatus),client);

        for (int i = 0; i < n; i++){
            System.out.println("Enter #" + (i+1) + " item data: ");

            System.out.print("Product name: ");
            String productName = sc.next();

            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            Integer productQuantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(productQuantity,productPrice,
                    new Product(productName,productPrice));

            order.addItem(orderItem);
        }

        System.out.println(order);


    }

}
