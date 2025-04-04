package com.cursojava.secao13.override.entities;

public class BussinessAccount extends Account {

    private Double loanLimit;

    public BussinessAccount(){
        super();  // Resguardar caso tenha alguma logica vindo da classe Account(SuperClass)
    }

    public BussinessAccount(Integer number, String bolder, Double balance, Double loanLimit) {
        super(number, bolder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if (amount <= loanLimit){
            balance+=amount - 10;
        }

    }

    @Override
    public void withdraw(Double amount){
        super.withdraw(amount); // Reutiliza o código que está na superClass
        balance-=2.0;
    }
}
