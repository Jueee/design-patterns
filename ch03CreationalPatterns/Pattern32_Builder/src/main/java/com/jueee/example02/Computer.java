package com.jueee.example02;

public class Computer {
    /*CPU*/
    private String CPU;
    /*内存*/
    private String memory;
    /*硬盘*/
    private String hardDisk;
    /*键盘*/
    private String keyboard;
    /*鼠标*/
    private String mouse;

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computer{" + "CPU='" + CPU + '\'' + ", memory='" + memory + '\'' + ", hardDisk='" + hardDisk + '\''
            + ", keyboard='" + keyboard + '\'' + ", mouse='" + mouse + '\'' + '}';
    }
}
