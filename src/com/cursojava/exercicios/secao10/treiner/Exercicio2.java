package com.cursojava.exercicios.secao10.treiner;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How Many Numbers in the List A:");
        int numbersA = sc.nextInt();
        System.out.println("How Many Numbers in the List B:");
        int numbersB = sc.nextInt();

        List<Integer>listA = new ArrayList<>();
        List<Integer>listB = new ArrayList<>();


        System.out.println("List A:");
        for (int i = 0; i < numbersA; i++){
            listA.add(sc.nextInt());
        }

        System.out.println("List B:");
        for (int i = 0; i < numbersB; i++){
            listB.add(sc.nextInt());
        }

        listA.addAll(listB);

        System.out.println("List Concat: " + listA);

    }
}
