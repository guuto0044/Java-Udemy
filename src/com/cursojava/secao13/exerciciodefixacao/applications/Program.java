package com.cursojava.secao13.exerciciodefixacao.applications;

import com.cursojava.secao13.exerciciodefixacao.entities.ImportedProduct;
import com.cursojava.secao13.exerciciodefixacao.entities.Product;
import com.cursojava.secao13.exerciciodefixacao.entities.UsedProduct;


import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number od products: ");
        int n = sc.nextInt();

        List<Product>list = new ArrayList<>();

        for(int i = 0; i < n; i++){

            System.out.print("Common, used or imported (c/u/i)? ");
            String options = sc.next();

            switch (options) {
                case "c" -> {

                    System.out.print("Name: ");
                    String nameComun = sc.next();

                    System.out.print("Price: ");
                    Double priceComun = sc.nextDouble();

                    Product product = new Product(nameComun, priceComun);

                    list.add(product);
                }
                case "u" -> {

                    System.out.print("Name: ");
                    String nameUsed = sc.next();

                    System.out.print("Price: ");
                    Double priceUsed = sc.nextDouble();

                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    Date dateUsed = sdf.parse(sc.next());

                    Product usedProduct = new UsedProduct(nameUsed, priceUsed, dateUsed);

                    list.add(usedProduct);
                }
                case "i" -> {

                    System.out.print("Name: ");
                    String nameImportedt = sc.next();

                    System.out.print("Price: ");
                    Double priceImpoted = sc.nextDouble();

                    System.out.print("Customs Fee: ");
                    Double coustomFeeImported = sc.nextDouble();

                    Product importedProduct = new ImportedProduct(nameImportedt, priceImpoted, coustomFeeImported);

                    list.add(importedProduct);
                }
            }
        }

        System.out.println("PRICE TAGS: ");

        for (Product p : list){
            System.out.print(p.priceTag());
        }

        sc.close();
    }
}
