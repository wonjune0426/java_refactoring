package com.example.magicnumber;

public class MagicNumberMain {
    public static void main(String[] args) {
        BeforeRobot beforeRobot = new BeforeRobot("Andrew");
        beforeRobot.order(1); // walk
        beforeRobot.order(2); // stops
        beforeRobot.order(3); // jump
    }
}
