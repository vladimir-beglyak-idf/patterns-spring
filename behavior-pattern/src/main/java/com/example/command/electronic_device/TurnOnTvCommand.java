package com.example.command.electronic_device;

public class TurnOnTvCommand implements Command {

    private ElectronicDevice device;

    public TurnOnTvCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }
}
