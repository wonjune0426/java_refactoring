package com.example.magicnumber;


public class BeforeRobot {
    private String _name;

    public BeforeRobot (String name){
        _name = name;
    }

    public void order(int command){
        if(command == 0){
            System.out.println(_name + " walks. ");
        } else if (command == 1) {
            System.out.println(_name + " stops. ");
        } else if (command == 2) {
            System.out.println(_name + " jumps. ");
        } else {
            System.out.println("Command error. command = "+command);
        }
    }
}
