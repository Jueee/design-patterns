package com.jueee.example02.factory;

import com.jueee.example02.computer.ComputerMemory;
import com.jueee.example02.computer.ComputerProcessor;
import com.jueee.example02.computer.ComputerScreen;
import com.jueee.example02.item.Memory;
import com.jueee.example02.item.Processor;
import com.jueee.example02.item.Screen;

// 电脑生产工厂
public class ComputerFactory implements ElectronicFactory {

    public Screen produceScreen() {
        return new ComputerScreen();
    }

    public Memory produceMemory() {
        return new ComputerMemory();
    }

    public Processor produceProcessor() {
        return new ComputerProcessor();
    }

}
