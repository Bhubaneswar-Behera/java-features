package com.designpatterns.behavioral.observer;

/*
 * Video Reference: https://youtu.be/-oLDJ2dbadA
 */
public class MainApp {


    public static void main(String[] args) {

        Store store = new Store();
        store.getService().subscribe(Event.NEW_ITEM, new EmailMsgListener("geekific@like.com"));
        store.getService().subscribe(Event.SALE, new EmailMsgListener("geekific@like.com"));
        store.getService().subscribe(Event.SALE, new EmailMsgListener("geekific@subs.com"));
        store.getService().subscribe(Event.NEW_ITEM, new MobileAppListener("GeekificLnS"));

        store.newItemPromotion();

        System.out.println("==========================================");

        store.salePromotion();

        System.out.println("==========================================");

        store.getService().unsubscribe(Event.SALE, new EmailMsgListener("geekific@like.com"));
        store.salePromotion();

    }

}
