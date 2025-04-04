package com.cursojava.secao13.override.application;

import com.cursojava.secao13.override.entities.Account;
import com.cursojava.secao13.override.entities.BussinessAccount;
import com.cursojava.secao13.override.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

//        @Override : É a implementação de uma SuperClass na SubClass.
//        Utiliza-se a anotação Override em um método Sobrescrito.(Avisa ao compilador)
//        É possível chamar a implementação da superclasse usando a palavra super.

//        795.0
        Account acc1 = new Account(1001,"Alex",1000.0);

        acc1.withdraw(200.0);

        System.out.println(acc1.getBalance());

//        800.0 - Sobreprosição (@Override)

        Account acc2 = new SavingsAccount(1002,"Lucas",1000.0,0.01);

        acc2.withdraw(200.0);

        System.out.println(acc2.getBalance());

//        793.0 - Utilizando o Super()

        Account acc3 = new BussinessAccount(1003,"Augusto", 1000.0, 500.0);

        acc3.withdraw(200.0);

        System.out.println(acc3.getBalance());
    }
}