package com.jueee.example02.factory;

import com.jueee.example02.item.Memory;
import com.jueee.example02.item.Processor;
import com.jueee.example02.item.Screen;
import com.jueee.example02.phone.PhoneMemory;
import com.jueee.example02.phone.PhoneProcessor;
import com.jueee.example02.phone.PhoneScreen;

// 手机生产工厂
public class PhoneFactory implements ElectronicFactory{

    public Screen produceScreen() {
        return new PhoneScreen();
    }

    public Memory produceMemory() {
        return new PhoneMemory();
    }

    public Processor produceProcessor() {
        return new PhoneProcessor();
    }

}
