package com.cursojava.exrciciosRecaptular.Interface.ex2.entities;

import com.cursojava.exrciciosRecaptular.Interface.ex2.service.CalculableArea;

public class Square implements CalculableArea {
    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public double calculeteArea() {
        return Math.pow(side,2);
    }
}
