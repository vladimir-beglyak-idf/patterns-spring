package com.example.command.electronic_device;

public class TurnOffTvCommand implements Command {

    private ElectronicDevice device;

    public TurnOffTvCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }
}
