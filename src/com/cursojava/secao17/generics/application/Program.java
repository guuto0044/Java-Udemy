package com.cursojava.secao17.generics.application;

import com.cursojava.secao17.generics.model.entities.PrintService;


import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How Many values? ");
        int n = sc.nextInt();

        PrintService<Integer> service = new PrintService<>();

        for (int i = 0; i < n; i++){
            int values = sc.nextInt();
            service.addValue(values);
        }

        service.print();

        System.out.print("First: " + service.first());

        sc.close();
    }
}
