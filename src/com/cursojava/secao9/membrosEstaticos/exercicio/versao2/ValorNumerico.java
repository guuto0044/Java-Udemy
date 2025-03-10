package com.cursojava.secao9.membrosEstaticos.exercicio.versao2;

import java.util.Locale;
import java.util.Scanner;

public class ValorNumerico {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        CalculoRaio calc = new CalculoRaio();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double radius = scanner.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);


        System.out.printf("Circumfarence: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", calc.pi);

        scanner.close();

    }


}
