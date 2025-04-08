package com.cursojava.secao13.exerciciofixacaofinal.application.entities;

public class Company extends Person{

    private Integer numberEmployeer;

    public Company(){

    }


    public Company(String name, Double annuaIcome, Integer numberEmployeer) {
        super(name, annuaIcome);
        this.numberEmployeer = numberEmployeer;
    }

    public Integer getNumberEmployeer() {
        return numberEmployeer;
    }

    public void setNumberEmployeer(Integer numberEmployeer) {
        this.numberEmployeer = numberEmployeer;
    }

    @Override
    public Double impost() {

        if (numberEmployeer < 10){

            return getAnnuaIcome() * 0.16;

        } else  {
            return getAnnuaIcome() * 0.14;
        }
    }

}
