package com.jueee.example02.factory;

import com.jueee.example02.item.Memory;
import com.jueee.example02.item.Processor;
import com.jueee.example02.item.Screen;

// 封装单个工厂类
public class AbstractFactory {

    private Screen screen;
    private Memory memory;
    private Processor processor;

    public void createFactory(final ElectronicFactory factory) {
        setScreen(factory.produceScreen());
        setMemory(factory.produceMemory());
        setProcessor(factory.produceProcessor());
    }

    public Screen getScreen() {
        return screen;
    }

    private void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Memory getMemory() {
        return memory;
    }

    private void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    private void setProcessor(Processor processor) {
        this.processor = processor;
    }
}
