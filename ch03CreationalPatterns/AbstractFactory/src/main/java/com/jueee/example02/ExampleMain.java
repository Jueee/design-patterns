package com.jueee.example02;

import com.jueee.example02.factory.AbstractFactory;
import com.jueee.example02.factory.ElectronicFactory;
import com.jueee.example02.factory.PhoneFactory;
import com.jueee.example02.item.Memory;
import com.jueee.example02.item.Processor;
import com.jueee.example02.item.Screen;

public class ExampleMain {
    
    public static void test1() {
        ElectronicFactory factory = new PhoneFactory();
        Screen screen = factory.produceScreen();
        Memory memory = factory.produceMemory();
        Processor processor = factory.produceProcessor();

        System.out.println(screen.getDescription()+"\n"+memory.getDescription()+"\n"+processor.getDescription());
    }
    
    public static void test2() {
        AbstractFactory factory = new AbstractFactory();

        System.out.println("produce phone...");

        factory.createFactory(FactoryMacker.makeFactory(FactoryType.PHONE));
        System.out.println(factory.getScreen().getDescription());
        System.out.println(factory.getMemory().getDescription());
        System.out.println(factory.getProcessor().getDescription());


        System.out.println("produce computer...");

        factory.createFactory(FactoryMacker.makeFactory(FactoryType.COMPUTER));
        System.out.println(factory.getScreen().getDescription());
        System.out.println(factory.getMemory().getDescription());
        System.out.println(factory.getProcessor().getDescription());
    }

    public static void main(String[] args) {
        test1();
        test2();
    }
}
