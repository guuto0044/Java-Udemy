package com.cursojava.secao13.upcastindowncasting.entities.application;

import com.cursojava.secao13.upcastindowncasting.entities.entities.Account;
import com.cursojava.secao13.upcastindowncasting.entities.entities.BussinessAccount;
import com.cursojava.secao13.upcastindowncasting.entities.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001,"Alex",0.0);
        BussinessAccount bacc = new BussinessAccount(1002,"Maria",0.0,500.0);

        // Upcasting : Converte objeto da SubClass para a SuperClass

        // Upcasting : A herança é uma realaçõa "é um", ou seja a conta BussinesAccount é uma Account.

        Account acc1 = bacc;

        // Atribui atributo o objeto da subClass para a SuperClass;
        Account acc2 = new BussinessAccount(1003,"Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // Downcasting: Converter objeto da SuperClass para a SubClass

        BussinessAccount acc4 = (BussinessAccount) acc2;
        acc4.loan(100.0);

//        BussinessAccount acc5 = (BussinessAccount) acc3; -> ERRO na compilação, o compilador não identifica a class

        if (acc3 instanceof BussinessAccount){
            BussinessAccount acc5 = (BussinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


    }
}
