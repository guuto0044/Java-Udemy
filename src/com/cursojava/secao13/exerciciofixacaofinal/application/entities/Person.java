package com.cursojava.secao13.exerciciofixacaofinal.application.entities;

public abstract class Person {

    private String name;
    private Double annuaIcome;

    public Person(){

    }

    public Person(String name, Double annuaIcome) {
        this.name = name;
        this.annuaIcome = annuaIcome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnuaIcome() {
        return annuaIcome;
    }

    public void setAnnuaIcome(Double annuaIcome) {
        this.annuaIcome = annuaIcome;
    }

    public abstract Double impost();
}
