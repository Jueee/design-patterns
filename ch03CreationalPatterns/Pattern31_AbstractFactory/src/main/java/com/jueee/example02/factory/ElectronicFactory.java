package com.jueee.example02.factory;

import com.jueee.example02.item.Memory;
import com.jueee.example02.item.Processor;
import com.jueee.example02.item.Screen;

// 电子设备生产工厂接口类
public interface ElectronicFactory {
    /**
     * 生产屏幕
     * @return
     */
    Screen produceScreen();

    /**
     * 生产内存条
     * @return
     */
    Memory produceMemory();

    /**
     * 生产处理器
     * @return
     */
    Processor produceProcessor();

}