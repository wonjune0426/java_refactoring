package com.example.magicnumber;

public class MagicNumberMain {
    public static void main(String[] args) {
        BeforeRobot beforeRobot = new BeforeRobot("Andrew");
        beforeRobot.order(1); // walk
        beforeRobot.order(2); // stops
        beforeRobot.order(3); // jump

        AfterRobot afterRobot = new AfterRobot("Andrew");
        afterRobot.order(AfterRobot.COMMAND_WALK);
        afterRobot.order(AfterRobot.COMMAND_STOP);
        afterRobot.order(AfterRobot.COMMAND_JUMP);

        EnumRobot enumRobot = new EnumRobot("Andrew");
        enumRobot.order(EnumRobot.Command.WALK);
        enumRobot.order(EnumRobot.Command.STOP);
        enumRobot.order(EnumRobot.Command.JUMP);
    }
}
