package com.cursojava.secao9.membrosEstaticos.exercicio.versao1;

/*

Métodos na Propria classe do Programa(Não faz muito sentido)

 */

import java.util.Locale;
import java.util.Scanner;

public class ValorNumerico {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double radius = scanner.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumfarence: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", PI);

        scanner.close();

    }

    public static double circumference(double radius){
        return 2 * PI * radius;
    }

    public static double volume(double radius){
        return 4 * PI * Math.pow(radius,3) / 3 ;
    }
}