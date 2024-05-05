package com.designpatterns.creational.abstract_factory.products;

public class MsiMonitor implements Monitor {

    @Override
    public void assemble() {
        // Logic relevant to MSI Monitors
        System.out.println("Assembling MSI Monitor");
    }

}
