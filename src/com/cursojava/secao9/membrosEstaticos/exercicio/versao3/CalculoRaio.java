package com.cursojava.secao9.membrosEstaticos.exercicio.versao3;

public class CalculoRaio {

    public static double PI = 3.14159;

    public static double circumference(double radius){
        return 2 * PI * radius;
    }

    public static double volume(double radius){
        return 4 * PI * Math.pow(radius,3) / 3 ;
    }
}
