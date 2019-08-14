package com.jueee.example02.computer;

import com.jueee.example02.item.Screen;

// 电脑屏幕
public class ComputerScreen implements Screen{

    static final String DESCRIPTION = "This is computer screen";

    public String getDescription() {
        return DESCRIPTION;
    }
}
