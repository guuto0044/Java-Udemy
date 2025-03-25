package com.cursojava.secao12.exercicioResolvido.entities;

import java.util.Date;

public class HourContract {

    private Date date;
    private Double valuePerHoure;
    private Integer hours;


    public HourContract(Date date, Double valuePerHoure, Integer hours) {
        this.date = date;
        this.valuePerHoure = valuePerHoure;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHoure() {
        return valuePerHoure;
    }

    public void setValuePerHoure(Double valuePerHoure) {
        this.valuePerHoure = valuePerHoure;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double totalValue(){ // Conceito de Delegção
        return valuePerHoure * hours;
    }
}
