package com.cursojava.secao10.exercicioProposto;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("How Many Numbers will you insert: ");
        int n = sc.nextInt();

        int [] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            vect[i] = sc.nextInt();
        }

        for (int i = vect.length -1; i>=0; i--){
            System.out.println(vect[i]);
        }

        sc.close();
    }
}
