package com.cursojava.secao13.abstractclass.exerciciofixacao.application;

import com.cursojava.secao13.abstractclass.exerciciofixacao.entities.Circle;
import com.cursojava.secao13.abstractclass.exerciciofixacao.entities.Retangle;
import com.cursojava.secao13.abstractclass.exerciciofixacao.entities.Shape;
import com.cursojava.secao13.abstractclass.exerciciofixacao.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape>list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.print("Retangle or Circle(r/c)? ");
            String options = sc.next();

            switch (options){

                case "c" ->{
                    System.out.print("Color (BLACK/BLUE/RED): ");
                    Color circleColor = Color.valueOf(sc.next());

                    System.out.print("Radius: ");
                    Double circleRadius = sc.nextDouble();

                    Shape circle = new Circle(circleColor,circleRadius);

                    list.add(circle);

                }

                case "r" ->{

                    System.out.print("color (BLACK/BLUE/RED): ");
                    Color retangleColor = Color.valueOf(sc.next());

                    System.out.print("Widht: ");
                    Double retangleWhitd = sc.nextDouble();

                    System.out.print("Height: ");
                    Double retangleHeight = sc.nextDouble();

                    Shape retangle = new Retangle(retangleColor,retangleWhitd,retangleHeight);

                    list.add(retangle);
                }
            }

        }

        System.out.println("SHAPE AREAS: ");

        for (Shape shape : list){
            System.out.printf("%.2f%n",shape.area());
        }


        sc.close();
    }
}
