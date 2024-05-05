package com.designpatterns.behavioral.visitor.models;

import com.designpatterns.behavioral.visitor.Visitor;

public class Company extends Client {

    private final int nbrOfEmployees;

    public Company(String name, String address, String number, int nbrOfEmployees) {
        super(name, address, number);
        this.nbrOfEmployees = nbrOfEmployees;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getNbrOfEmployees() {
        return nbrOfEmployees;
    }
}
