package com.cursojava.secao17.curingasdelimitados.application;

import java.util.ArrayList;
import java.util.List;

public class Covariancia {

    //    Principio get/put - Covariância;

    //    GET - OK;

    public static void main(String[] args) {
        List<Integer>intList = new ArrayList<Integer>();

        intList.add(10);
        intList.add(3);

        List<? extends Number> list = intList;

        list.getFirst();

//        list.add(3); // ERRO -  PUT

    }
}
