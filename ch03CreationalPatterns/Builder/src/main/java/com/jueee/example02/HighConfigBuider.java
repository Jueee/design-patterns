package com.jueee.example02;

public class HighConfigBuider implements ComputerConfigBuilder {

    private Computer mComputer;

    public HighConfigBuider(){
        this.mComputer = new Computer();
    }

    public void setCPU() {
        mComputer.setCPU("i7");
    }

    public void setMemery() {
        mComputer.setMemory("16G");
    }

    public void setHardDisk() {
        mComputer.setHardDisk("1T");
    }

    public void setKeyboard() {
        mComputer.setKeyboard("机械键盘");
    }

    public void setMouse() {
        mComputer.setMouse("无线鼠标");
    }

    public Computer getComputer() {
        return mComputer;
    }
}