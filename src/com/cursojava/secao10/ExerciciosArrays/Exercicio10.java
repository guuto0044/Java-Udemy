package com.cursojava.secao10.ExerciciosArrays;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double mediaFinal;

        System.out.println("How many Students will go in the process: ");
        int studentsQauntity = sc.nextInt();

        String [] names = new String[studentsQauntity];
        double [] note1 = new double[studentsQauntity];
        double [] note2 = new double[studentsQauntity];


        for (int i = 0; i < names.length; i++){
            System.out.println("Digit a Name, First note and sencond note for " + (i+1) + " Student: ");
            sc.nextLine();
            names[i] = sc.nextLine();
            note1[i] = sc.nextDouble();
            note2[i] = sc.nextDouble();

        }

        System.out.println("Approved Students: ");

        for (int i =0; i < studentsQauntity; i++){
            mediaFinal = (note1[i] + note2[i])/2;

            if (mediaFinal >=6){
                System.out.println(names[i]);
            }
        }



        sc.close();
    }
}
