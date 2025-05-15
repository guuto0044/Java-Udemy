package com.cursojava.exrciciosRecaptular.Interface.ex2.application;

import com.cursojava.exrciciosRecaptular.Interface.ex2.entities.Circle;
import com.cursojava.exrciciosRecaptular.Interface.ex2.entities.Rectangle;
import com.cursojava.exrciciosRecaptular.Interface.ex2.entities.Square;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try{
            Square square = new Square(2.0);
            Rectangle rectangle = new Rectangle(2.0,4.0);
            Circle circle = new Circle(4.0);

            Double [] positions = new Double[3];

            positions[0] = square.calculeteArea();
            positions[1] = rectangle.calculeteArea();
            positions[2] = circle.calculeteArea();
//            positions[4] = square.calculeteArea(); RunTimeException

            for (Double p : positions){
                System.out.println(p);
            }

        } catch (RuntimeException e) {
            throw new RuntimeException("Array > [3] don't exist!" + e.getMessage());
        }


    }
}
