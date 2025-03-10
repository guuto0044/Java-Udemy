package com.cursojava.secao9.membrosEstaticos.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the dollar price: $");
        double dollar = scanner.nextDouble();

        System.out.println("How many dollars will be bought: R$");
        double reais = scanner.nextDouble();

        System.out.println("Amount to be paid in reais: R$" + CurrencyConverter.buyDollar(dollar,reais));

        scanner.close();

    }
}
