package com.cursojava.secao17.curingasdelimitados.application;

import java.util.ArrayList;
import java.util.List;


public class Contravariancia {
//    Contravariância - PUT-Ok
    public static void main(String[] args) {
        List<Object>myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("Lucas");

        List<? super Number>myNumber = myObjs;

        myNumber.add(10);
        myNumber.add(3.14);

//        Number x = myNumber.get(0);  Erro - GET
    }
}
