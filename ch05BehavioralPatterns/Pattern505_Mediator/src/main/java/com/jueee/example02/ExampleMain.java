package com.jueee.example02;

public class ExampleMain {

    public static void main(String[] args) {
        ControllerMediator controller = new ControllerMediator();
        
        ViewColleague view = new ViewColleague(controller);
        ModelColleague model = new ModelColleague(controller);
        
        controller.setView(view).setModel(model);

        //view change:
        System.out.println("----");
        view.mockClick();

        //model change:
        System.out.println("----");
        model.shutdown();

    }
}
