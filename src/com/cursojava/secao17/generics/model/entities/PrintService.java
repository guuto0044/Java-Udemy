package com.cursojava.secao17.generics.model.entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<Type> {

    private final List<Type>listValues = new ArrayList<>();

    public PrintService(){

    }

    public void addValue(Type value){
        listValues.add(value);
    }

    public Type first(){
        if (listValues.isEmpty()){
            throw new IllegalStateException("List is empty!");
        } else {
            return listValues.getFirst();
        }
    }

    public void print(){
        System.out.println(listValues);
    }
}
