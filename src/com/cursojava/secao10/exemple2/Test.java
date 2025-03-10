package com.cursojava.secao10.exemple2;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How Many Products in your Super Market : ");
        int qtdProducts = sc.nextInt();

        Product [] vect = new Product[qtdProducts];

        for (int i = 0; i < vect.length; i++){

            System.out.println((i+1) + " Product: ");
            String name = sc.next();

            System.out.println("Price: $");
            double price = sc.nextDouble();

            vect[i] = new Product(name,price);

        }

        double sum = 0;

        for (Product product : vect) {
            sum += product.getPrice();
        }

        double avg = sum/qtdProducts;

        System.out.printf("AVARAGE PRICE:%.2f%n", avg );

        sc.close();
    }
}
