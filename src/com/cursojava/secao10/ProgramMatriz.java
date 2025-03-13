package com.cursojava.secao10;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ProgramMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int countNegative = 0;

        System.out.println("How Many numbers you will put in the matriz: ");
        int numbers = sc.nextInt();

        int [][] matriz = new int[numbers][numbers];

        for (int i = 0; i < matriz.length; i++){ // Pecorre as linhas
            for (int j = 0; j < matriz[i].length; j++){ // Pecorre as colunas
                matriz[i][j] = sc.nextInt();
            }
        }


        System.out.println("Main Diagonal: ");

        for(int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] < 0){
                    countNegative++;
                }
            }
        }
        System.out.println();

        System.out.print("Negative Numbers = " + countNegative);

        sc.close();
    }
}
