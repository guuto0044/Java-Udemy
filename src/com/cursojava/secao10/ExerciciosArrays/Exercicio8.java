package com.cursojava.secao10.ExerciciosArrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How Many values wil each vector have: ");
        int elemnets = sc.nextInt();

        int [] vector = new int[elemnets];

        for(int i = 0; i < vector.length; i++){
            System.out.println("Digit one Number: ");
            vector[i] = sc.nextInt();
        }

        double evenSum = 0;
        double evenMedia = 0;
        int evenCount = 0;

        for (int v : vector) {
            if (v % 2 == 0) {
                evenCount++;
                evenSum += v;
                evenMedia = evenSum / evenCount;
            } else {
                System.out.println("DON'T HAVE EVEN NUMBER!");
                break;
            }
        }

        System.out.print("EVEN MEDIA = " + evenMedia);

        sc.close();


    }
}
