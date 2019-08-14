package com.jueee.example09;

import java.util.concurrent.atomic.AtomicReference;

public class SingletonPattern {
    
    // 利用AtomicReference
    private static final AtomicReference<SingletonPattern> INSTANCE = new AtomicReference<SingletonPattern>();

    // 私有化
    private SingletonPattern(){
        System.out.println("Singleton has loaded");
    }

    // 用CAS确保线程安全
    public static SingletonPattern getInstance() {
        for(;;) {
            SingletonPattern current = INSTANCE.get();
            if (current != null) {
                return current;
            }
            current = new SingletonPattern();
            if (INSTANCE.compareAndSet(null, current)) {
                return current;
            }
        }
    }
}
