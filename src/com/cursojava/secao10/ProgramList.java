package com.cursojava.secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramList {
    public static void main(String[] args) {

        List <String> list = new ArrayList<>();

        list.add("Augusto");
        list.add("Leo");
        list.add("Guto");
        list.add("Lais");
        list.add("Michael");
        list.add(2,"Alex");

        System.out.println(list.size());

//        list.remove(1);

        for (String l : list){
            System.out.println(l);
        }

        // Remover elementos pelo Predicado
        System.out.println("---------------------");
        list.removeIf(x -> x.charAt(0) == 'M'); // Função Lambda (true or false);

        for (String l : list){
            System.out.println(l);
        }

        System.out.println("---------------------");
        System.out.println("Index of Guto: " + list.indexOf("Guto"));
        System.out.println("Index of Augusto: " + list.indexOf("Augusto")); // Se não encontraer o dado retorna -1;

        // Retorna Pessoas com apenas com a primeira Latra L:
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());

        for (String l : result){
            System.out.println(l);
        }

        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }
}
