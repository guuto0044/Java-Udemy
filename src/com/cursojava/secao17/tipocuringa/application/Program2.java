package com.cursojava.secao17.tipocuringa.application;

//  Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo":

import java.util.Arrays;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        List<Integer>myInts = Arrays.asList(5,2,10);
        printList(myInts);

        List<String>myString = Arrays.asList("Guto","Lala");
        printList(myString);
    }

    public static void printList(List<?>list){
        for (Object obj : list){
            System.out.println(obj);
        }
    }
}
