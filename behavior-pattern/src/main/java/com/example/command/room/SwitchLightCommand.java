package com.example.command.room;

public class SwitchLightCommand implements Command {

    private Light light;

    public SwitchLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchLights();
        System.out.println("Is light switched on: " + light.isSwitchedOn());
    }
}
