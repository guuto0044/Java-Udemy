package com.cursojava.secao16.interfaces.exerciciofixacao.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    private LocalDate dueDate;
    private Double amount;

    public Installment(){

    }

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getdueDate() {
        return dueDate;
    }

    public void setdueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return dtf.format(dueDate) + " - " + amount;
    }
}
