package com.cursojava.exrciciosRecaptular.Interface.ex1.service;

import com.cursojava.exrciciosRecaptular.Interface.ex1.entities.Espress;
import com.cursojava.exrciciosRecaptular.Interface.ex1.entities.Invoice;

import java.time.Duration;

public class DeliveredService {

    private final Double pricePerHour;
    private final Double pricePerDay;

    private final TaxService taxService;


    public DeliveredService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processPayment(Espress espress){
        double min = Duration.between(espress.getStart(), espress.getFinish()).toMinutes();
        double hour = min/60;

        double basePayment;

        if (hour <= 8){
            basePayment = Math.ceil(hour) * pricePerHour;
        } else {
            basePayment = Math.ceil(hour/24) * pricePerDay;
        }

        double tax = taxService.tax(basePayment);

        double valueTotal = basePayment + tax;

        espress.setInvoice(new Invoice(hour,basePayment,tax,valueTotal));

    }
}
