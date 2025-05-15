package com.cursojava.exrciciosRecaptular.Interface.ex1.application;

import com.cursojava.exrciciosRecaptular.Interface.ex1.entities.Espress;
import com.cursojava.exrciciosRecaptular.Interface.ex1.service.BrazilTaxService;
import com.cursojava.exrciciosRecaptular.Interface.ex1.service.DeliveredService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.print("coding of the package: ");
        String description = sc.nextLine();

        System.out.print("Withdrawal(dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),dtf);

        System.out.print("Delivered(dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),dtf);

        System.out.print("Value per Hour: ");
        Double pricePerHour = sc.nextDouble();

        System.out.print("Value per Day: ");
        Double pricePerDay = sc.nextDouble();

        Espress espress = new Espress(description,start,finish);

        DeliveredService service = new DeliveredService(pricePerHour,pricePerDay, new BrazilTaxService());

        service.processPayment(espress);

        System.out.println();

        System.out.println("STATUS: ");
        System.out.println("CODE PACKAGE: " + espress.getDescription());
        System.out.println("Duration: " + espress.getInvoice().getDuration());
        System.out.println("Basic Payment: " + espress.getInvoice().getBasePayment());
        System.out.println("Tax: " + espress.getInvoice().getTax());
        System.out.println("Value Total: " + espress.getInvoice().getTotalValue());


    }
}
