package com.cursojava.secao9.encapsulamento.exercicio;

public class BankAccount {

    private String numberAccount;
    private String name;
    private  double balance;

    public BankAccount(String numberAccount, String name, double balance) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.balance = balance;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double value){
        if (value > 0){
            balance+=value;
        } else {
            System.out.println("You don't have found!");
        }
        return balance;
    }

    public double whithdraw(double value){
        balance = balance - value - 5;
        return balance;
    }


    @Override
    public String toString() {
        return  "Account '" + getNumberAccount() + '\'' +
                ", Holder: '" + getName() + '\'' +
                ", balance: R$" + getBalance();
    }
}
