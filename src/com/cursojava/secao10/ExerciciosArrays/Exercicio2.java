package com.cursojava.secao10.ExerciciosArrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How many Number's will you enter: ");
        int quantityReal = sc.nextInt();

        double [] realNumbers = new double[quantityReal];

        for(int i = 0;  i < realNumbers.length; i++){
            System.out.println("Enter a real Number: ");
            realNumbers[i] = sc.nextDouble();
        }

        System.out.print("Values = ");
        for (double n : realNumbers){
            System.out.print(n + " ");
        }

        System.out.println();

        double sum = 0;

        System.out.print("SUM = ");

        for (double n : realNumbers){
            sum+=n;
        }

        System.out.print(sum);

        System.out.println();

        double avg = sum/quantityReal;

        System.out.printf("AVARAGE HEIGHT = %.2f%n", avg);


        sc.close();
    }
}
