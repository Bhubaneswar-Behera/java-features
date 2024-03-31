package com.designpatterns.creational.factory;

public class ChickenBurger implements Burger {
        @Override
        public void prepare() {
            // Prepare Chicken Burger
            System.out.println("Preparing Chicken Burger...");
        }

}
