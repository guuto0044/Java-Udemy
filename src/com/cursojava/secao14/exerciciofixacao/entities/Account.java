package com.cursojava.secao14.exerciciofixacao.entities;

import com.cursojava.secao14.exerciciofixacao.model.exception.DomainException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

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

    public void deposit(Double amount){
        if (amount > 0){
            balance+=amount;
        }
    }

    public void withdraw(Double amount) throws DomainException {

        if (balance == 0){
            System.out.print("Withdraw error: The amount exceeds withdraw limit.");
        } else if (amount > withdrawLimit) {
            System.out.print("Withdraw error: The amount exceeds withdraw limit.");
        } else if (amount > balance) {
            System.out.print("Withdraw error: Not enough balance.");
        } else {
            balance-=amount;
            System.out.print("New balance: " + balance);
        }

    }
}



