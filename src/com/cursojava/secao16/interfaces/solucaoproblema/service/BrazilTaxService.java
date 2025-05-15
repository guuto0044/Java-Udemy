package com.cursojava.secao16.interfaces.solucaoproblema.service;

import com.cursojava.secao16.interfaces.solucaoproblema.repository.TaxService;

public class BrazilTaxService implements TaxService {

    public double tax(double amount){
        if (amount <= 100.0){
            return amount * TAX_20;
        } else {
            return amount * TAX_15;
        }

    }
}
