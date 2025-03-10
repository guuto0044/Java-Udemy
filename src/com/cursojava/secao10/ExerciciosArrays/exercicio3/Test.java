package com.cursojava.secao10.ExerciciosArrays.exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many people in the test: ");
        int quantityPeople = sc.nextInt();

        People [] vect = new People[quantityPeople];

        for (int i = 0; i < vect.length; i++){
            System.out.println("Date for " + (i+1) + " Person: ");

            System.out.println("Name: ");
            String name = sc.next();

            System.out.println("Age: ");
            int age = sc.nextInt();

            System.out.println("Height: ");
            double height = sc.nextDouble();

            vect[i] = new People(name,age,height);

        }

        double sum = 0;

        for (People h : vect){
            sum+=h.getHeight();
        }

        double avg = sum/quantityPeople;


        int minior = 0;

        for (People a : vect ){
            if (a.getIdade() < 16){
                minior++;
            }
        }

        double percent = ((double) minior/ quantityPeople) * 100;


        System.out.printf("AVARAGE HEIGHT: %.2f%n", avg);
        System.out.printf("People under 16 years old: %.1f%n", percent);

        for (People a : vect ){
            if (a.getIdade() < 16){
                System.out.println(a.getName());
            }
        }

        sc.close();
    }
}
