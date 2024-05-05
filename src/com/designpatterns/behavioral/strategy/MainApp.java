package com.designpatterns.behavioral.strategy;

/*
 * Video Reference: https://youtu.be/Nrwj3gZiuJU
 */
public class MainApp {
    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();
        // The strategy can now be easily picked at runtime

        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder(100);

        System.out.println("==========================================");

        paymentService.setStrategy(new PaymentByPayPal());
        paymentService.processOrder(100);

    }

}
