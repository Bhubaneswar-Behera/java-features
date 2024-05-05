package com.designpatterns.creational.abstract_factory.factories;

import com.designpatterns.creational.abstract_factory.products.Gpu;
import com.designpatterns.creational.abstract_factory.products.Monitor;
import com.designpatterns.creational.abstract_factory.products.MsiGpu;
import com.designpatterns.creational.abstract_factory.products.MsiMonitor;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }

}
