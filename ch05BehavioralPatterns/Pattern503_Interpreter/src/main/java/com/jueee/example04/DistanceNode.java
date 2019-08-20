package com.jueee.example04;

public class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String d) {
        this.distance = d;
    }

    @Override
    public String interpret() {
        return "["+distance+"]";
    }

}
