package com.cursojava.secao17.set.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>(); // HashSet - TreeSet - LinkedHashSet

        set.add("Notebook");
        set.add("Tv");
        set.add("Tablet");

        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println(set.contains("Notebook")); // true or false

        for (String h : set){
            System.out.println(h);
        }

    }
}
