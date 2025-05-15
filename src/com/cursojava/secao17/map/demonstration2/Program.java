package com.cursojava.secao17.map.demonstration2;

import com.cursojava.secao17.map.demonstration2.entities.Product;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 900.0);
        Product p2 = new Product("Tbalet", 450.0);
        Product p3 = new Product("Iphone", 800.0);

        stock.put(p1, 1000.0);
        stock.put(p2, 2000.0);
        stock.put(p3, 3000.0);

        Product ps = new Product("TV", 900.0);

        System.out.println("Stock contains 'TV': " + stock.containsKey(ps));

        for (Product stocks : stock.keySet()) {
            System.out.println(stocks.getName() + " :" + stocks.getPrice());
        }
    }
}
