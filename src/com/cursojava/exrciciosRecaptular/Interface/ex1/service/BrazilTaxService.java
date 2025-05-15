package com.cursojava.exrciciosRecaptular.Interface.ex1.service;

public class BrazilTaxService implements TaxService{

    @Override
    public double tax(double amount) {
        if (amount <= 100){
            return amount * TAX_20;
        } else {
            return amount * TAX_15;
        }
    }
}
