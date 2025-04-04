package com.cursojava.secao13.polimorfismo.application;

import com.cursojava.secao13.polimorfismo.entities.Account;
import com.cursojava.secao13.polimorfismo.entities.BussinessAccount;
import com.cursojava.secao13.polimorfismo.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

//        Polimorfismo: Muitas formas.

        Account x = new Account(1001,"Alex",1000.0);
        Account y = new SavingsAccount(1002,"Guto",1000.0,0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());

    }
}