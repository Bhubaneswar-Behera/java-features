package com.designpatterns.structural.composite;

import com.designpatterns.structural.composite.products.Book;
import com.designpatterns.structural.composite.products.VideoGame;

/*
 * Video Reference: https://youtu.be/oo9AsGqnisk
 */
public class MainApp {


    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
                new CompositeBox(
                        new VideoGame("1", 100)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("2", 200),
                                new Book("3", 300)
                        ),
                        new VideoGame("4", 400),
                        new VideoGame("5", 500)
                )
        );
        System.out.println(deliveryService.calculateOrderPrice());

    }

}
