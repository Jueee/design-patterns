package com.jueee.example02;

public class ModelColleague extends AbstractColleague {

    public ModelColleague(IMediator m) {
        super(m);
    }

    public String whenClick(){
        System.out.println("Model should return some data to view.");
        return "data";
    }

    public void shutdown(){
        System.out.println("Model will shutdown in 5 sec.");
        getMediator().react(this);
    }
}
