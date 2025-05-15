package com.cursojava.exrciciosRecaptular.Interface.ex2.entities;

import com.cursojava.exrciciosRecaptular.Interface.ex2.service.CalculableArea;

public class Rectangle implements CalculableArea {

    private Double side;
    private Double heidht;

    public Rectangle(Double side, Double heidht) {
        this.side = side;
        this.heidht = heidht;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    public Double getHeidht() {
        return heidht;
    }

    public void setHeidht(Double heidht) {
        this.heidht = heidht;
    }

    @Override
    public double calculeteArea() {
        return side * heidht;
    }
}
