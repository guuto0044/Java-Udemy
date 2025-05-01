package com.cursojava.secao16.interfaces.defaultmethod.application;

import com.cursojava.secao16.interfaces.defaultmethod.service.BrazilInterestService;
import com.cursojava.secao16.interfaces.defaultmethod.service.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService service = new BrazilInterestService(2.0);



        System.out.println("Payment after " + months + ": ");
        System.out.println(String.format("%.2f",service.payment(amount,months)));

        sc.close();
    }
}
