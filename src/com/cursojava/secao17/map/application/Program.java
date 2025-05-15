package com.cursojava.secao17.map.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String,String> cookies = new TreeMap<>();

        cookies.put("username","Augusto");
        cookies.put("email","augusto.souza@gmail.com");
        cookies.put("phone","(99)7372839");

        cookies.remove("email");


        cookies.put("phone","(99)672728"); // O value pode ser aletrado;

        System.out.println("Contains 'username' key: " + cookies.containsKey("username"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        for (String key : cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
