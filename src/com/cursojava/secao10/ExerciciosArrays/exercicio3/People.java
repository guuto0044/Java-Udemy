package com.cursojava.secao10.ExerciciosArrays.exercicio3;

public class People {

    private String name;
    private int idade;
    private double height;

    public People(String name, int idade, double height) {
        this.name = name;
        this.idade = idade;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
