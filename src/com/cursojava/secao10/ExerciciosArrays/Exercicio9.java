package com.cursojava.secao10.ExerciciosArrays;


import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How Many People will be join: ");
        int peopleQuantity = sc.nextInt();

        String [] name = new String[peopleQuantity];
        int [] age = new int[peopleQuantity];

        for (int i = 0; i < name.length; i++){
            System.out.println((i+1) + " Person: ");

            System.out.println("Name: ");
            name[i] = sc.next();

            System.out.println("Age: ");
            age[i] = sc.nextInt();

        }

        int ageMax = Integer.MIN_VALUE;
        int position = 0;

       for (int i = 0; i < age.length; i++){
           if (age[i] > ageMax){
               ageMax = age[i];
               position = i;
           }

       }
        System.out.print("Old Person = " + name[position]);

        sc.close();
    }
}
