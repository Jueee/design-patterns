package com.jueee.example02;

public interface Prototype {
    
    public Prototype clone();

    public String getName();

    public void setName(String name);
}
