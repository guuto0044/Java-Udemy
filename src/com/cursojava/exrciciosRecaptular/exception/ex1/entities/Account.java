package com.cursojava.exrciciosRecaptular.exception.ex1.entities;

import com.cursojava.exrciciosRecaptular.exception.ex1.domain.DomainExcpetion;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private  Double withdrawLimit;

    public Account(){

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void withdraw(double amount) throws DomainExcpetion {

       if (amount > withdrawLimit){
           throw new DomainExcpetion("Erro: The value extends limits of withdraw.");
       } else if (amount > balance) {
           throw new DomainExcpetion("Erro: Saldo insuficiente");
       } else {
           balance-=amount;
           System.out.print("New Balance: " + balance);
       }

    }

}
