package com.cursojava.secao12.exercicioFixacao.entities;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal(){
        double sum = 0;

        if (quantity > 1){
            sum= price + price;
        } else {
            sum+=price;
        }
        return sum;
    }

    @Override
    public String toString() {

        StringBuilder sbOrderItem = new StringBuilder();

        sbOrderItem.append(product.getName() + ", " + product.getPrice() + ", " + "quantity: " + quantity + ", " + "Subtotal: $" + subTotal());

        return sbOrderItem.toString();
    }
}
