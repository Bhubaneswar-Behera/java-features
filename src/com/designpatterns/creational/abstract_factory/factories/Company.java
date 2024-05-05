package com.designpatterns.creational.abstract_factory.factories;

import com.designpatterns.creational.abstract_factory.products.Gpu;
import com.designpatterns.creational.abstract_factory.products.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();

}
