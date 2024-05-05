package com.designpatterns.creational.abstract_factory.factories;

import com.designpatterns.creational.abstract_factory.products.AsusGpu;
import com.designpatterns.creational.abstract_factory.products.AsusMonitor;
import com.designpatterns.creational.abstract_factory.products.Gpu;
import com.designpatterns.creational.abstract_factory.products.Monitor;

public class AsusManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

}
