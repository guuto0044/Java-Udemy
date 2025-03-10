package com.cursojava.secao10.ExerciciosArrays;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers will you enter:");
        int quantityReal = sc.nextInt();

        double [] vect = new double[quantityReal];

        double max = Double.MIN_VALUE;
        int position = -1;

        for (int i = 0; i < vect.length; i++){
            System.out.println("Digit one Number:");
            vect[i] = sc.nextDouble();

            if (vect[i] > max) {
                max = vect[i];
                position = i;
            }

        }

//        double max = Arrays.stream(vect).max().getAsDouble();

        System.out.print("MOST VALUE = " + max);
        System.out.println();
        System.out.print("POSITION OF THE MAX VALUE = " + position);


        sc.close();
    }
}
