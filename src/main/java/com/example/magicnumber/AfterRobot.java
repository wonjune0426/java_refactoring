package com.example.magicnumber;

public class AfterRobot {

    private final String _name;

    public AfterRobot(String name){
        _name = name;
    }

    public static final int COMMAND_WALK = 0;
    public static final int COMMAND_STOP = 1;
    public static final int COMMAND_JUMP = 2;


    public void order(int command) {
        if (command == COMMAND_WALK) {
            System.out.println(_name + " walks. ");
        } else if (command == COMMAND_STOP) {
            System.out.println(_name + " stops. ");
        } else if (command == COMMAND_JUMP) {
            System.out.println(_name + " jumps. ");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}
