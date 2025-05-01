package com.cursojava.secao16.interfaces.defaultmethod.service;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterest();

    default double payment(double amount, int months){
        if (months < 1){
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + getInterest() / 100.0, months);
    }

}

