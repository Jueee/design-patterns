package com.jueee.example01;

public class ExampleMain {
    
    public static void main(String[] args) {
        Visitor ceo = new VisitorCEO();
        Visitor a = new VisitorA();
        Visitor b = new VisitorB();
        Element pa = new PartA();
        Element pb = new PartB();
        ObjectStructure os = new ObjectStructure();

        os.addVisitor(pa);
        os.addVisitor(pb);
        os.accapt(ceo);
        os.accapt(a);
        os.accapt(b);
     }
}
