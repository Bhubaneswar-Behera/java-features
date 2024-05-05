package com.designpatterns.creational.abstract_factory;

import com.designpatterns.creational.abstract_factory.factories.AsusManufacturer;
import com.designpatterns.creational.abstract_factory.factories.Company;
import com.designpatterns.creational.abstract_factory.factories.MsiManufacturer;
import com.designpatterns.creational.abstract_factory.products.Product;

import java.util.List;

/*
 * Video Reference: https://youtu.be/QNpwWkdFvgQ
 */
public class MainApp {


    public static void main(String[] args) {

        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();

        List.of(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor())
                .forEach(Product::assemble);

    }

}
