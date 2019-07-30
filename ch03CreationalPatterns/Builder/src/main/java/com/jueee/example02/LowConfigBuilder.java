package com.jueee.example02;

// 低配版的套餐
public class LowConfigBuilder implements ComputerConfigBuilder {

    private Computer mComputer;

    public LowConfigBuilder(){
        this.mComputer = new Computer();
    }

    public void setCPU() {
        mComputer.setCPU("i5");
    }

    public void setMemery() {
        mComputer.setMemory("8G");
    }

    public void setHardDisk() {
        mComputer.setHardDisk("500G");
    }

    public void setKeyboard() {
        mComputer.setKeyboard("薄膜键盘");
    }

    public void setMouse() {
        mComputer.setMouse("有线鼠标");
    }

    public Computer getComputer() {
        return mComputer;
    }
}

