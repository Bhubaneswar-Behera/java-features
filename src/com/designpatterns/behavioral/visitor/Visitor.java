package com.designpatterns.behavioral.visitor;

import com.designpatterns.behavioral.visitor.models.Bank;
import com.designpatterns.behavioral.visitor.models.Company;
import com.designpatterns.behavioral.visitor.models.Resident;
import com.designpatterns.behavioral.visitor.models.Restaurant;

public interface Visitor {

    void visit(Bank bank);

    void visit(Company company);

    void visit(Resident resident);

    void visit(Restaurant restaurant);

}
