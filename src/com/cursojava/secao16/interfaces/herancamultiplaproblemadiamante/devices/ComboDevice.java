package com.cursojava.secao16.interfaces.herancamultiplaproblemadiamante.devices;

public class ComboDevice extends Device implements Scanner, Printer{


    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing: " + doc);
    }

    @Override
    public String print(String doc) {
        return "Combo printing: " + doc;
    }

    @Override
    public String scan() {
        return "Combo scan result";
    }
}
