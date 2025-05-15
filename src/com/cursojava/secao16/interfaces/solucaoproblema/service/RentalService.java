package com.cursojava.secao16.interfaces.solucaoproblema.service;

import com.cursojava.secao16.interfaces.solucaoproblema.entities.CarRental;
import com.cursojava.secao16.interfaces.solucaoproblema.entities.Invoice;
import com.cursojava.secao16.interfaces.solucaoproblema.repository.TaxService;

import java.time.Duration;

public class RentalService {

    private final Double pricePerHour;
    private final Double pricePerDay;

    private final TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }


    public void processInvoice(CarRental carRental){
        //Encotra a duaração entre dois instantes
        double min = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours =  min/60; // Calcula a fração para elevar o valor para hora exata.

        double basicPayment;

        if (hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours); // Arredonda o preço para cima, por hora!
        } else {
            basicPayment = pricePerDay * Math.ceil(hours/24);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment,tax));
    }

}
