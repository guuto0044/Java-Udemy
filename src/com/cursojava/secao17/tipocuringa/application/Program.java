package com.cursojava.secao17.tipocuringa.application;

// Wildcard Types:

// Genrics são invariantes;

// List<Object> não é o supertipo de qualquer tipo de lista:


// Mas o List<?> é o Supertipo de qualquer lista.
/*


   public class Program {
    public static void main(String[] args) {

        List<Object> myObjs = new ArrayList<Object>();
        List<Integer>myNumbers = new ArrayList<Integer>();

        myObjs = myNumbers; (ERRO - Integer é um Object, mas List Integer)
    }
}

 */

// O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<?>myObjs = new ArrayList<Object>();
        List<Integer>myNumbers = new ArrayList<Integer>();

        myObjs = myNumbers;
    }
}
