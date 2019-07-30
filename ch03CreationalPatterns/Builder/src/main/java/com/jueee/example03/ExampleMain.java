package com.jueee.example03;

public class ExampleMain {

    public static void main(String[] args) {
        Person person = new Person.Builder("张三","男")
            .age("12")
            .money("1000000")
            .car("宝马")
            .build();
        System.out.println(person.getName());
        System.out.println(person.getCar());
        System.out.println(person.getMoney());
        System.out.println(person.getHouse());
    }
}
