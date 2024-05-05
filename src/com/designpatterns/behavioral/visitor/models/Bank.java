package com.designpatterns.behavioral.visitor.models;

import com.designpatterns.behavioral.visitor.Visitor;

public class Bank extends Client {

    private final int branchesInsured;

    public Bank(String name, String address, String number, int branchesInsured) {
        super(name, address, number);
        this.branchesInsured = branchesInsured;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getBranchesInsured() {
        return branchesInsured;
    }
}
