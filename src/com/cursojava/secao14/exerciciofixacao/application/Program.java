package com.cursojava.secao14.exerciciofixacao.application;

import com.cursojava.secao14.exerciciofixacao.entities.Account;
import com.cursojava.secao14.exerciciofixacao.model.exception.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws DomainException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: ");

        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Holder: ");
        String holder = sc.next();

        sc.next();

        System.out.print("initial balance: ");
        Double balance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number,holder,balance,withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        Double amountWithdraw = sc.nextDouble();

        account.withdraw(amountWithdraw);

        sc.close();
    }
}