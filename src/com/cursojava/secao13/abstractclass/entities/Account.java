package com.cursojava.secao13.abstractclass.entities;

public abstract class Account {

    private Integer number;
    private String bolder;
    protected Double balance; // O Portected consegue acessar na propria classe e uma SubClasse;

    public  Account(){

    }

    public Account(Integer number, String bolder, Double balance) {
        this.number = number;
        this.bolder = bolder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getBolder() {
        return bolder;
    }

    public void setBolder(String bolder) {
        this.bolder = bolder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void withdraw(Double amount){
        balance-=amount+5.0;
    }

    public  void deposit(Double amount){
        balance+=amount;
    }
}
