package com.jueee.example02;

public abstract class AbstractColleague {
    protected IMediator mediator;

    public AbstractColleague(IMediator m) {
        mediator = m;
    }

    public final IMediator getMediator() {
        return mediator;
    }
}
