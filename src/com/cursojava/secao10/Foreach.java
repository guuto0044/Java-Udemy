package com.cursojava.secao10;

public class Foreach {
    public static void main(String[] args) {
        String [] vect = new String[]{"Guto","Augusto","Lais"};

        for (String names : vect){ // Contido no seu vetor.
            System.out.println(names);
        }
    }
}