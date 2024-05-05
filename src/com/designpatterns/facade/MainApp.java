package com.designpatterns.facade;

/*
 * Video Reference: https://youtu.be/xWk6jvqyhAQ
 */

public class MainApp {


    public static void main(String[] args) {

        BuyCryptoFacade buyCrypto = new BuyCryptoFacade();
        buyCrypto.buyCryptocurrency(1000, "BTC");

    }

}