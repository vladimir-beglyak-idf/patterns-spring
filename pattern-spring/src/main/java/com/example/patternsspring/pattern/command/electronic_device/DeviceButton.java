package com.example.patternsspring.pattern.command.electronic_device;

public class DeviceButton {

    private Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
