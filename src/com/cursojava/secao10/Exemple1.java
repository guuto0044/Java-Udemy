package com.cursojava.secao10;

import java.util.Locale;
import java.util.Scanner;


public class Exemple1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de pessoas no teste: ");
        int people = scanner.nextInt();

        double [] alturas = new double[people];

        for (int i = 0; i < alturas.length; i++){
            System.out.println("Altura "+ (i+1)+":");
            alturas[i] = scanner.nextDouble();
        }

        double sum = 0;

        for (double altura : alturas) {
            sum += altura;
        }

        double avg = sum/people;

        System.out.printf("AvARAGE HEIGHT: %.2f%n",avg);
        scanner.close();

    }
}
