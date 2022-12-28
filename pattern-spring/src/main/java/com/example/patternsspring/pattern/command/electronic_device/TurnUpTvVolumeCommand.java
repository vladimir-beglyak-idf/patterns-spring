package com.example.patternsspring.pattern.command.electronic_device;

public class TurnUpTvVolumeCommand implements Command {

    private ElectronicDevice device;

    public TurnUpTvVolumeCommand(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnUpVolume();
    }
}
