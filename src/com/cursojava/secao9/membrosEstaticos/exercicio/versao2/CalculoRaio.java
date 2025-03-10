package com.cursojava.secao9.membrosEstaticos.exercicio.versao2;

public class CalculoRaio {

    public double pi = 3.14159;

    public double circumference(double radius){
        return 2 * pi * radius;
    }

    public double volume(double radius){
        return 4 * pi * Math.pow(radius,3) / 3 ;
    }
}
