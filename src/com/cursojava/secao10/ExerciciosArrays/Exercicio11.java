package com.cursojava.secao10.ExerciciosArrays;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double shorterHeight = Integer.MAX_VALUE;
        double higherHeight = Integer.MIN_VALUE;
        int positionShoter = 0;
        int positionHeight = 0;
        int count = 0;
        int mansCount = 0;
        double womansMedia = 0;

        System.out.println("How Many People join to the project: ");
        int peopleQuantity = sc.nextInt();

        double[] height = new double[peopleQuantity];
        String[] gender = new String[peopleQuantity];

        for (int i = 0; i < height.length; i++) {
            System.out.println("Height of the " + (i + 1) + " person: ");
            height[i] = sc.nextDouble();
            System.out.println("Gender of the " + (i + 1) + " person: ");
            gender[i] = sc.next();

            while (true){
                if (!Objects.equals(gender[i], "M") && !Objects.equals(gender[i],"F")) {
                    System.out.println("Gender incorrect...Repeat: ");
                    gender[i] = sc.next();
                } else {
                    break;
                }
            }
        }

        for (int i = 0; i < height.length; i++){
            if (shorterHeight > height[i]){
                shorterHeight = height[i];
                positionShoter = i;
            }
        }

        for (int i = 0; i < height.length; i++){
            if (higherHeight < height[i]){
                higherHeight = height[i];
                positionHeight = i;
            }
        }

        for (int i = 0; i < height.length; i++){
           if (gender[i].equals("F")){
               count++;
               womansMedia = (height[i] + height[i])/count;
           }
        }

        for (int i = 0; i < height.length; i++){
            if (gender[i].equals("M")){
                mansCount++;
            }
        }

        System.out.println("Shorter Height: " + height[positionShoter]);
        System.out.println("Higher Height: " + height[positionHeight]);
        System.out.printf("Woman's Media = %.2f%n", womansMedia );
        System.out.println("Man's Number: " + mansCount);





    }
}