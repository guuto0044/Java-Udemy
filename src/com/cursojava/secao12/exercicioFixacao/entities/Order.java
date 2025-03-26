package com.cursojava.secao12.exercicioFixacao.entities;

import com.cursojava.secao12.exercicioFixacao.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat sdfMoment = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem>items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void remove(OrderItem item){
        items.remove(item);
    }

    public Double totalPrice(){
        double total = 0;

        for (OrderItem i : items){
             total += i.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("ORDER SUMMARY: " + "\n" + "Order moment: " + sdfMoment.format(moment) + "\n");
        sb.append("Order Status: " + getStatus() + "\n");
        sb.append("Client: " + client.getName() + " " + "(" + sdf.format(client.getBirthDate()) + ")" + " - " +
                client.getEmail() + "\n" + "Order Items: " + "\n");

        for (OrderItem i : items){
           sb.append(i.toString() + "\n");
        }

        sb.append("Total price: $" + totalPrice());

        return sb.toString();
    }
}
