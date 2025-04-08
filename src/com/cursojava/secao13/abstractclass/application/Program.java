package com.cursojava.secao13.abstractclass.application;

import com.cursojava.secao13.abstractclass.entities.Account;
import com.cursojava.secao13.abstractclass.entities.BussinessAccount;
import com.cursojava.secao13.abstractclass.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
//        Para garantir que contas comuns não sejam instanciadas, basta acresecentar a  palavra "abstract" na declaração
//        da classe.

//        Notação UML: Fonte -> Itálico

//        Account acc = new Account(1001,"Lucas",1000.0); Não pode instânciar a SuperClasse;

//        Account acc1 = new SavingsAccount(1002,"Alex", 1000.0,0.01);
//        Account acc2 = new BussinessAccount(1003,"Maria", 1000.0,500.0);

        Locale.setDefault(Locale.US);

        List<Account>list = new ArrayList<>();

        list.add(new SavingsAccount(1001,"Alex", 500.0,0.01));

        list.add(new BussinessAccount(1002,"Maria",1000.0,400.0));

        list.add(new SavingsAccount(1003,"Lucas",300.0,0.01));

        list.add(new BussinessAccount(1004,"Bob",500.0,500.0));

        double sum = 0;

        for (Account acc : list){ // Para cada ... na minha lista | array
            sum+= acc.getBalance();
        }

        System.out.printf("Total Balance: %.2f%n", sum);

        for (Account acc : list){
            acc.deposit(10.0);
        }

        for (Account acc : list){
            System.out.printf("Updated Balance for account %d: %.2f%n",acc.getNumber(), acc.getBalance());
        }

    }
}