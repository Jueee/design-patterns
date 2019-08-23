package com.jueee.example01;

public class ExampleMain {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);
        
        mediator.setColleagueA(colleagueA).setColleagueB(colleagueB);
        
        System.out.println("---");
        colleagueA.operation();
        
        System.out.println("---");
        colleagueB.operation();
    }
}
