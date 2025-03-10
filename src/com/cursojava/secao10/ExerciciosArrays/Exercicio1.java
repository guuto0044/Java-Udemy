package com.cursojava.secao10.ExerciciosArrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How many Number's will you enter: ");
        int quantityNumbers = sc.nextInt();

        int [] vect = new int[quantityNumbers];

        for(int i = 0; i < vect.length; i++){
            System.out.println("Enter a Number: ");
            vect[i] = sc.nextInt();

            while (vect[i] > 10){
                System.out.println("Reapeat Number(Max: 10): ");
                vect[i] = sc.nextInt();
            }
        }

        System.out.println("Negative Numbers:");
        for (int n : vect){
            if (n < 0){
                System.out.println(n);
            }
        }

        sc.close();
    }
}
