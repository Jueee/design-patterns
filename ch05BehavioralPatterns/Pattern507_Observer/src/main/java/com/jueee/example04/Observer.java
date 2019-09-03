package com.jueee.example04;

/**
 * 观察抽象类
 */

public interface Observer {
    public String getName();

    public void setName(String name);

    public void help();

    public void beAttacked(AllyControlCenter acc);
}