package com.cursojava.secao15.lendoarquivotexto.exerciciodefixacao.application;


import com.cursojava.secao15.lendoarquivotexto.exerciciodefixacao.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a folder path: ");
//        String strPath = sc.nextLine();

        String strPath = "/Users/augustocesarsouza/Documents/out/summary.csv";


        List<Product>products = new ArrayList<>();

        for (int i = 0; i < 4; i++){

            System.out.println("Name Product: ");
            String name = sc.next();

            sc.nextLine();

            System.out.println("Price: ");
            Double price = sc.nextDouble();

            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(name,price,quantity);

            products.add(product);

        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPath))){

            for (Product p : products){
                bw.write(p.toString());
                bw.newLine();
            }

            System.out.println("Summary Succesful process...");

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        for (Product p : products){
            System.out.println(p);
        }

        sc.close();
    }
}
