package com.cursojava.secao13.exerciciofixacaofinal.application.entities;

public class Individual extends Person{

    private Double healthExpenses;

    public Individual(){

    }

    public Individual(String name, Double annuaIcome, Double healthExpenses) {
        super(name, annuaIcome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double impost() {

        if (getAnnuaIcome() < 20000.0){

            return getAnnuaIcome() * 0.15 - healthExpenses * 0.50;

        } else {

            return getAnnuaIcome() * 0.25 - healthExpenses * 0.50;

        }

    }
}
