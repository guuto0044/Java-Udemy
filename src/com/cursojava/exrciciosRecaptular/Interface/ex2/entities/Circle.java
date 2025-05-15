package com.cursojava.exrciciosRecaptular.Interface.ex2.entities;

import com.cursojava.exrciciosRecaptular.Interface.ex2.service.CalculableArea;

public class Circle implements CalculableArea {

    private Double ray;



    public Circle(Double ray) {
        this.ray = ray;
    }

    public Double getRay() {
        return ray;
    }

    public void setRay(Double ray) {
        this.ray = ray;
    }

    @Override
    public double calculeteArea() {
        return Math.PI * Math.pow(ray, 2);
    }
}
