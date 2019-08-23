package com.jueee.example02;

public class ViewColleague extends AbstractColleague {
    public ViewColleague(IMediator m) {
        super(m);
    }

    public void mockClick() {
        System.out.println("View got a click action.");
        getMediator().react(this);
    }

    public void display(String data) {
        System.out.println("View got " + data + " from model.");
    }

    public void prepareShutdown() {
        System.out.println("View knows that: Model gonna shutdown, backup your data.");
    }
}