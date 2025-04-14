package com.cursojava.secao14.stacktrace.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();

        System.out.println("End Program!");

    }

    public static void method1(){
        System.out.println("-----METHOD 1 START-----");
        method2();
        System.out.println("-----METHOD 1 END-----");

    }

    public static void method2() {
        System.out.println("-----METHOD 2 START-----");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Position!");
            e.printStackTrace(); // Mostra a chamada de metodos que mostra o percurso da exeção.
            sc.next();
        } catch (InputMismatchException i) {
            System.out.println("Input Error!");
        }
        System.out.println("-----METHOD 2 END-----");
        sc.close();
    }
}