package com.cursojava.secao16.interfaces.defaultmethod.service;

public class BrazilInterestService implements InterestService{

    private final Double interest;

    public BrazilInterestService(Double interest) {
        this.interest = interest;
    }

    @Override
    public double getInterest() {
        return interest;
    }


}
