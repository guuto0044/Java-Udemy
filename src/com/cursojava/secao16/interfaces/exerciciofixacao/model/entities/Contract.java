package com.cursojava.secao16.interfaces.exerciciofixacao.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer number;
    private LocalDate date;
    private Double valueTotal;

    private final List<Installment>installments = new ArrayList<>();

    public Contract(Integer number, LocalDate date, Double valueTotal) {
        this.number = number;
        this.date = date;
        this.valueTotal = valueTotal;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValueTotal() {
        return valueTotal;
    }

    public void setValueTotal(Double valueTotal) {
        this.valueTotal = valueTotal;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

}
