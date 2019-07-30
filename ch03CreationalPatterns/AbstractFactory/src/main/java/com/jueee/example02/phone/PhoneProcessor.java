package com.jueee.example02.phone;

import com.jueee.example02.item.Processor;

// 手机处理器类
public class PhoneProcessor implements Processor {

    static final String DESCRIPTION = "This is phone processor";

    public String getDescription() {
        return DESCRIPTION;
    }
}
