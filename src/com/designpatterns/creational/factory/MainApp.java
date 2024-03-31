package com.designpatterns.creational.factory;

public class MainApp {
    /*
     * Video Reference: https://youtu.be/EdFq_JIThqM
     */
    public static void main(String[] args) {

        Restaurant chickenRestaurant = new ChickenBurgerRestaurant();
        chickenRestaurant.orderBurger();

        System.out.println("==========================================");

        Restaurant veggieRestaurant = new VeggieBurgerRestaurant();
        veggieRestaurant.orderBurger();

    }
}
