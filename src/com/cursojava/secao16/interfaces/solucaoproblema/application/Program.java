package com.cursojava.secao16.interfaces.solucaoproblema.application;

import com.cursojava.secao16.interfaces.solucaoproblema.entities.CarRental;
import com.cursojava.secao16.interfaces.solucaoproblema.entities.Vehicle;
import com.cursojava.secao16.interfaces.solucaoproblema.service.BrazilTaxService;
import com.cursojava.secao16.interfaces.solucaoproblema.service.RentalService;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do Aluguel:");

        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),dtf);

        System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),dtf);

        CarRental carRental = new CarRental(start,finish,new Vehicle(carModel));

        System.out.print("Entre com o preço por hora: ");
        Double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        Double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour,pricePerDay,new BrazilTaxService()); // Injeção de Depedência;

        rentalService.processInvoice(carRental);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: " + carRental.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + carRental.getInvoice().getTax());
        System.out.println("Pagamento Total: " + carRental.getInvoice().totalPayment());

        sc.close();
    }
}
