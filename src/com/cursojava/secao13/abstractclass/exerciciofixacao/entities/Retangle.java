package com.cursojava.secao13.abstractclass.exerciciofixacao.entities;

import com.cursojava.secao13.abstractclass.exerciciofixacao.enums.Color;

public class Retangle extends Shape{

    private Double widht;
    private Double height;


    public Retangle(){

    }

    public Retangle(Color color, Double widht, Double height) {
        super(color);
        this.widht = widht;
        this.height = height;
    }


    public Double getWidht() {
        return widht;
    }

    public void setWidht(Double widht) {
        this.widht = widht;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double area() {
        return widht*height;
    }
}
