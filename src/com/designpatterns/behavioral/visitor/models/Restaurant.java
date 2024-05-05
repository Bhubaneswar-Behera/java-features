package com.designpatterns.behavioral.visitor.models;

import com.designpatterns.behavioral.visitor.Visitor;

public class Restaurant extends Client {

    public final boolean availableAbroad;

    public Restaurant(String name, String address, String number, boolean availableAbroad) {
        super(name, address, number);
        this.availableAbroad = availableAbroad;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public boolean isAvailableAbroad() {
        return availableAbroad;
    }
}
