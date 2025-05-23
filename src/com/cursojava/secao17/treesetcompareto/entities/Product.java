package com.cursojava.secao17.treesetcompareto.entities;

public class Product implements Comparable<Product> {

    private String name;
    private Double price;

    public Product(){

    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product other) {
        return name.toUpperCase().compareTo(other.name.toUpperCase());
    }
}
