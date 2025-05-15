package com.cursojava.exrciciosRecaptular.exception.ex1.application;

import com.cursojava.exrciciosRecaptular.exception.ex1.entities.Account;

public class Program {
    public static void main(String[] args){
        Account account = new Account();

        account.setBalance(100.0);
        account.setWithdrawLimit(300.0);
        account.withdraw(200.0);
    }
}
