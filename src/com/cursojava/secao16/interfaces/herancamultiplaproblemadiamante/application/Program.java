package com.cursojava.secao16.interfaces.herancamultiplaproblemadiamante.application;

import com.cursojava.secao16.interfaces.herancamultiplaproblemadiamante.devices.ComboDevice;
import com.cursojava.secao16.interfaces.herancamultiplaproblemadiamante.devices.ConcretePrinter;
import com.cursojava.secao16.interfaces.herancamultiplaproblemadiamante.devices.ConcreteScanner;

public class Program {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        System.out.println(p.print("My Letter"));

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        System.out.println();
        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissertation");
        System.out.println(c.print("My dissertation"));
        System.out.println("Scan result: " + c.scan());
    }
}
