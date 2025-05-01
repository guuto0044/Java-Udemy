package com.cursojava.secao16.interfaces.defaultmethod.service;

public class UsaInterestService implements InterestService{

    private final Double interest;

    public UsaInterestService(Double interest) {
        this.interest = interest;
    }

    @Override
    public double getInterest() {
        return interest;
    }


}
