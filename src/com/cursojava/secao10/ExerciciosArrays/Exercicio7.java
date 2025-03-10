package com.cursojava.secao10.ExerciciosArrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How Many element's will each Vector have: ");
        int elements = sc.nextInt();

        double [] vector = new double[elements];


        for (int i = 0; i < vector.length; i++){
            System.out.println("Digit one Number: ");
            vector[i] = sc.nextDouble();
        }

        double sum = 0;

        for (double n : vector){
            sum+=n;
        }

        double arithmeticMean = 0;

        arithmeticMean = sum/elements;

        System.out.printf("Arithmetic Mean = %.3f%n" , arithmeticMean);

        System.out.println("Numbers under the Arithmetic Mean:");

        for (double v : vector) {
            if (v < arithmeticMean) {
                System.out.println(v);
            }
        }

        sc.close();
    }
}
