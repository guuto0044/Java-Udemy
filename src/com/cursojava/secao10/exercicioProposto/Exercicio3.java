package com.cursojava.secao10.exercicioProposto;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int sum = 0;


        int [][] mat = new int[3][3];

        int [] sumLine = new int[3];
        int [] sumColumn = new int[3];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for (int[] ints : mat) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }

        System.out.print("Sum = " + sum);

        System.out.println();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sumLine[i] += mat[i][j];
                sumColumn[j] += mat[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Line " + (i + 1) + ": " + sumLine[i]);
        }

        for (int j = 0; j < 3; j++) {
            System.out.println("Column " + (j + 1) + ": " + sumColumn[j]);
        }

        sc.close();
    }
}
