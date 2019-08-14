package com.jueee.example02;

public class Director {
    
    private ComputerConfigBuilder mBuilder;

    public void setBuilder(ComputerConfigBuilder builder) {
        this.mBuilder = builder;
    }

    public void createComputer() {
        mBuilder.setCPU();
        mBuilder.setMemery();
        mBuilder.setHardDisk();
        mBuilder.setKeyboard();
        mBuilder.setMouse();
    }

    public Computer getComputer() {
        return mBuilder.getComputer();
    }
}
