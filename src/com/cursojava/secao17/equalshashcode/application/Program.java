package com.cursojava.secao17.equalshashcode.application;

import com.cursojava.secao17.equalshashcode.entities.Client;

public class Program {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Maria", "alex@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

//        String name = "Maria";
//        String name2 = "Maria";
//
//        System.out.println(name == name2); // Trata de uma forma espcial para literais.

        System.out.println(c1 == c2); // Referencia ao valor de memoria (False);

        System.out.println(c1.equals(c2)); // Conteúdo;
    }
}
