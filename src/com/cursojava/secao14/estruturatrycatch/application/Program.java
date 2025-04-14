package com.cursojava.secao14.estruturatrycatch.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            String [] vect  = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Position!");
        } catch (InputMismatchException i){
            System.out.println("Input Error!");
        }

        System.out.println("End Program!");

        sc.close();
    }
}
