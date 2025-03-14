package com.cursojava.secao10.exercicioProposto;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String [] vect = new String[3];

        for (int i = 0; i < vect.length; i++){
            System.out.println("Name: ");
            vect[i] = sc.next();
        }


        System.out.println("Found a Name: ");
        String foundName = sc.next();

        boolean found = false;
        int position = 0;

        for (int i = 0; i < vect.length; i++){
            if (vect[i].equalsIgnoreCase(foundName)){
                found = true;
                position=i;
                break;
            }
        }
        if (found){

            System.out.println("Name Found: ");
            System.out.println("Position = " + position);

        } else {
            System.out.println("Name not found!");
        }


    }
}
