package com.example.command.electronic_device;

public class TurnDownTvVolumeCommand implements Command {

    private ElectronicDevice device;

    public TurnDownTvVolumeCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnDownVolume();
    }
}
