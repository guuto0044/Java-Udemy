package com.cursojava.exrciciosRecaptular.Interface.ex1.entities;

public class Invoice {

    private Double duration;
    private Double basePayment;
    private Double tax;
    private Double totalValue;


    public Invoice(Double duration, Double basePayment, Double tax, Double totalValue) {
        this.duration = duration;
        this.basePayment = basePayment;
        this.tax = tax;
        this.totalValue = totalValue;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Double getBasePayment() {
        return basePayment;
    }

    public void setBasePayment(Double basePayment) {
        this.basePayment = basePayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }
}
