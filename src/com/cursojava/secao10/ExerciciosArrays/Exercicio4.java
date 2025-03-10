package com.cursojava.secao10.ExerciciosArrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers will you enter: ");
        int quantityNumbers = sc.nextInt();

        int [] numbers = new int[quantityNumbers];

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Digit one Number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("EVEN NUMBERS:");
        for (int e : numbers){
            if (e % 2 == 0){
                System.out.print(e + " ");
            }
        }

        int quantityEven = 0;

        for (int e : numbers){
            if (e % 2 == 0){
                quantityEven++;
            }
        }

        System.out.println();

        System.out.print("EVEN QUANTITY = " + quantityEven);

        sc.close();
    }
}
