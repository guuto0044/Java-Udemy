package com.cursojava.secao9.membrosEstaticos.exercicio.versao3;

import java.util.Locale;
import java.util.Scanner;

/*

MEMBROS ESTATICOS X MEMBROS COMUNS:

- Insância de Objeto, cada um tem seu valor;

- Valores que nãO MUDAM. Estáticos.


 */

public class ValorNumerico {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Radius: ");
        double radius = scanner.nextDouble();

        double c = CalculoRaio.circumference(radius);

        double v = CalculoRaio.volume(radius);

        System.out.printf("Circumfarence: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", CalculoRaio.PI);

        scanner.close();

    }


}
