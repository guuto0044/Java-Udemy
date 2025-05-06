package com.cursojava.secao17.curingasdelimitados.entities;

public class Rectangle implements Shape{

    private Double widht;
    private Double hight;

    public Rectangle(){

    }

    public Rectangle(Double widht, Double hight) {

        this.widht = widht;
        this.hight = hight;
    }

    public Double getWidht() {
        return widht;
    }

    public void setWidht(Double widht) {
        this.widht = widht;
    }

    public Double getHight() {
        return hight;
    }

    public void setHight(Double hight) {
        this.hight = hight;
    }


    @Override
    public double area() {
        return widht * hight;
    }
}
