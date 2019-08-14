package com.jueee.example01;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr+"-"+name);
    }
    
}