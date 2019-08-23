package com.jueee.example01;

public class ConcreteMediator implements Mediator {
    // 持有并维护同事A
    private ConcreteColleagueA colleagueA;
    // 持有并维护同事B
    private ConcreteColleagueB colleagueB;

    public ConcreteMediator setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
        return this;
    }

    public ConcreteMediator setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
        return this;
    }

    @Override
    public void changed(Colleague c) {
        if (c instanceof ConcreteColleagueA) {
            colleagueB.print();
        } else if (c instanceof ConcreteColleagueB) {
            colleagueA.print();
        } else {
            System.out.println("Not Supported Class: " + c.getClass().getName());
        }
    }

}
