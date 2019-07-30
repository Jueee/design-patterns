package com.jueee.example02;

import com.jueee.example02.factory.ComputerFactory;
import com.jueee.example02.factory.ElectronicFactory;
import com.jueee.example02.factory.PhoneFactory;

// 工厂创建器
public class FactoryMacker {

    public static ElectronicFactory makeFactory(FactoryType type){
        switch (type){
            case PHONE:
                return new PhoneFactory();
            case COMPUTER:
                return new ComputerFactory();
            default:
                throw new IllegalArgumentException("FactoryType not supported.");
        }
    }
}
