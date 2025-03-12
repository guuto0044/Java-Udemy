package com.cursojava.secao10.exercicioFixacao;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }



    public void incrasseSalary(double x){
        double percent = x/100;
        double increase = salary * percent;
        salary+=increase;
    }

    @Override
    public String toString() {
        return  id + ", " +
                name + "," +
                salary;
    }
}
