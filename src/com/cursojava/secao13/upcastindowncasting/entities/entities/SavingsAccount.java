package com.cursojava.secao13.upcastindowncasting.entities.entities;

public class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String bolder, Double balance, Double interestRate) {
        super(number, bolder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }
}
