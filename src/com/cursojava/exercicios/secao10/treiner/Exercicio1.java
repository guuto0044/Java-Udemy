package com.cursojava.exercicios.secao10.treiner;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);


        System.out.println("Digit N number's: ");
        int n = sc.nextInt();

        int [] vect = new int[n];

        System.out.println("Inform " + n + " number's: ");
        for (int i = 0; i < vect.length; i++){
            vect[i] = sc.nextInt();
        }

        System.out.println("What a number you looking for: ");
        int number = sc.nextInt();

        int count = 0;
        boolean found = false;

        for (int i : vect) {
            if (number == i) {
                count++;
                found = true;
            }
        }

        if (found){
            System.out.println("Number " + number + " appears " + count + " times in array's");
        } else {
            System.out.println("Number " + number + " is not exist!");
        }



        sc.close();
    }
}
