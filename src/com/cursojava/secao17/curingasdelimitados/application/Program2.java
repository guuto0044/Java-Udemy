package com.cursojava.secao17.curingasdelimitados.application;

import java.util.*;

public class Program2 {
//    Principio GET/PUT
    public static void main(String[] args) {

        List<Integer>myInts = Arrays.asList(1,2,3);
        List<Double>myDoubles = Arrays.asList(3.14,6.28);
        List<Object>myObjs = new ArrayList<Object>();

        copy(myInts,myObjs);
        printList(myObjs);

        copy(myDoubles,myObjs);
        printList(myObjs);


    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for (Number num : source){
            destiny.add(num);
        }
    }

    public static void printList(List<?>list){
        for (Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
