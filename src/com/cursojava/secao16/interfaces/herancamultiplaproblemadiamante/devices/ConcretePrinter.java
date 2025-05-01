package com.cursojava.secao16.interfaces.herancamultiplaproblemadiamante.devices;

public class ConcretePrinter extends Device implements Printer{

    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer Processing: " + doc);
    }

    @Override
    public String print(String doc) {
        return "Printing: " + doc;
    }
}
