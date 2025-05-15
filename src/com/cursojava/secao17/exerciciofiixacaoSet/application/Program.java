package com.cursojava.secao17.exerciciofiixacaoSet.application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        int students;
        int n;

        System.out.print("How many students for course A?");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            students = sc.nextInt();
            a.add(students);
        }

        System.out.print("How many students for course B?");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            students = sc.nextInt();
            b.add(students);
        }

        System.out.print("How many students for course C?");
        n = sc.nextInt();

        for (int i = 0; i < n; i++){
            students = sc.nextInt();
            c.add(students);
        }

        Set<Integer>total = new HashSet<>();
        total.addAll(a);
        total.addAll(b);
        total.addAll(c);

        System.out.print("Total Students: " + total.size());

        sc.close();

    }
}
