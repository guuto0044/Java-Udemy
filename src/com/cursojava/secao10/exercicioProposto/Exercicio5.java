package com.cursojava.secao10.exercicioProposto;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How Many Lines: ");
        int n = sc.nextInt();

        System.out.println("How Many Columns: ");
        int m = sc.nextInt();

        int [][] mat = new int[n][m];

        int mult = 1;

        for(int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for (int[] ints : mat) {
            for (int anInt : ints) {
                mult *= anInt;
            }
        }

       System.out.print("Result Mult = " + mult);

        sc.close();
    }
}
