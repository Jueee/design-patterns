package com.jueee.example02;

public class ControllerMediator implements IMediator {
    private ViewColleague viewColleague;
    private ModelColleague modelColleague;

    public ControllerMediator setView(ViewColleague v) {
        viewColleague = v;
        return this;
    }

    public ControllerMediator setModel(ModelColleague m) {
        modelColleague = m;
        return this;
    }

    @Override
    public void react(AbstractColleague c) {
        if (c instanceof ViewColleague) {
            String data = modelColleague.whenClick();
            viewColleague.display(data);
        } else if (c instanceof ModelColleague) {
            viewColleague.prepareShutdown();
        } else {
            System.out.println("Not Supported Class: " + c.getClass().getName());
        }
    }
}