package com.cursojava.secao17.treesetcompareto.application;

import com.cursojava.secao17.treesetcompareto.entities.Product;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV",900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));


        for (Product p : set){
            System.out.println(p);
        }


        // Por base da referência de ponteiros - False;
        // Retorna true, quando aplicamos o hashCode e o equals na classe;
        // HashCode avalia primeiro e o equals confirma a igualdade;


    }
}
