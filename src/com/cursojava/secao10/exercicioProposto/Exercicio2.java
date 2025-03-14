package com.cursojava.secao10.exercicioProposto;

import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Integer>list = new ArrayList<>();

        while (true){
            System.out.println("Insert a number: ");
            int n = sc.nextInt();

            while (numberRepeat(list,n)){
                System.out.println("Number alrady Taken! Repeat: ");
                n = sc.nextInt();
            }

            if (n == -1){
                break;
            } else {
                list.add(n);
            }

        }

        for(int i : list){
            System.out.print(i + "  ");
        }

        System.out.println();

        int numMax = Collections.max(list);
        int numMin = Collections.min(list);

        System.out.print("Max Number = " + numMax);
        System.out.println();
        System.out.print("Min Number = " + numMin);

        sc.close();
    }

    public static boolean numberRepeat(List<Integer> list, int n) {
        return list.stream().anyMatch(x -> x == n);
    }
}

