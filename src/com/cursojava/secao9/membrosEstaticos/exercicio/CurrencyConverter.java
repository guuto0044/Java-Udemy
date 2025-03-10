package com.cursojava.secao9.membrosEstaticos.exercicio;

public class CurrencyConverter {

    public static double buyDollar(double d, double r){
        return (d*r) + (d * r * 0.06);
    }


}
