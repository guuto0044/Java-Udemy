package com.cursojava.secao16.interfaces.herancainterface.model.entities;


import com.cursojava.secao16.interfaces.herancainterface.model.enums.Color;

public class Circle extends AbstractShape{

    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }
}
