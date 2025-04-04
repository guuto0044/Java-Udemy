package com.cursojava.secao13.exerciciodefixacao.entities;

public class ImportedProduct extends Product{

    private Double customFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    @Override
    public String priceTag(){
        return getName() + " $ " + totalPrice() + " (Customs free: $" + customFee + ")" + "\n";
    }

    public Double totalPrice(){
        return getPrice() + customFee;
    }
}
