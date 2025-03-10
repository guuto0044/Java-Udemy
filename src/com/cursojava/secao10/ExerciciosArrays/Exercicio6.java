package com.cursojava.secao10.ExerciciosArrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How many values will each vector have: ");
        int values = sc.nextInt();

        int [] vectorA = new int[values];
        int [] vectorB = new int[values];
        int [] vectorC = new int[values];


        System.out.println("VALUES A:");
        for (int i = 0; i < vectorA.length; i++){
            vectorA[i] = sc.nextInt();
        }

        System.out.println("VALUES B:");
        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = sc.nextInt();
        }

        System.out.println("VALUES C:");
        for (int i = 0; i < vectorC.length; i++){
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.println(vectorC[i]);
        }

        sc.close();
    }
}
