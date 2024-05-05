package com.designpatterns.behavioral.visitor.models;

import com.designpatterns.behavioral.visitor.Visitor;

public class Resident extends Client {

    private final String insuranceClass;

    public Resident(String name, String address, String number, String insuranceClass) {
        super(name, address, number);
        this.insuranceClass = insuranceClass;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getInsuranceClass() {
        return insuranceClass;
    }
}
