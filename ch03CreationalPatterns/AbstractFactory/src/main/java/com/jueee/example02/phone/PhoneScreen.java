package com.jueee.example02.phone;

import com.jueee.example02.item.Screen;

// 手机屏幕类
public class PhoneScreen implements Screen{

    static final String DESCRIPTION = "This is phone screen";

    public String getDescription() {
        return DESCRIPTION;
    }
}
