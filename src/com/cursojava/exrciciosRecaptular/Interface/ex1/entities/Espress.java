package com.cursojava.exrciciosRecaptular.Interface.ex1.entities;

import java.time.LocalDateTime;

public class Espress {

    private String description;
    private LocalDateTime start;
    private LocalDateTime finish;
    private Invoice invoice;

    public Espress(){

    }

    public Espress(String description, LocalDateTime start, LocalDateTime finish) {
        this.description = description;
        this.start = start;
        this.finish = finish;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
