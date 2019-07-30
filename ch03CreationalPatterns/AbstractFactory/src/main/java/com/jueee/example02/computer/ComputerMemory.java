package com.jueee.example02.computer;

import com.jueee.example02.item.Memory;

// 电脑内存条
public class ComputerMemory implements Memory{

    static final String DESCRIPTION = "This is computer memory";

    public String getDescription() {
        return DESCRIPTION;
    }
}
