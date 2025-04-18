package com.cursojava.secao13.exerciciodefixacao.entities;

import java.text.SimpleDateFormat;

import java.util.Date;

public class UsedProduct extends Product{


    private Date manufactureDate;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() + " (used) $" + getPrice() + " (Manufacture date: " +
                sdf.format(manufactureDate) + ")" + "\n";
    }
}
