package com.jueee.example02.computer;

import com.jueee.example02.item.Processor;

// 电脑处理器
public class ComputerProcessor implements Processor{

    static final String DESCRIPTION = "This is computer processor";

    public String getDescription() {
        return DESCRIPTION;
    }
}