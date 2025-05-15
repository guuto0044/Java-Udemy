package com.cursojava.secao17.set.application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program2 {
    public static void main(String[] args) {

        Set<Integer> a  = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b  = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

//        Union: Union

        System.out.println("UNION:");
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

//        Intersection: Numbers iguals

        System.out.println("INTERSECTION:");
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

//        Difference - No exist

        System.out.println("DIFFERENCE:");
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}
