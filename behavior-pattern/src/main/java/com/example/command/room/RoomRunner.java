package com.example.command.room;

public class RoomRunner {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        livingRoom.addCommand(new SwitchLightCommand(new Light()));
        livingRoom.addCommand(new AddFurnitureCommand(new Sofa()));
        livingRoom.executeCommand();
    }
}
