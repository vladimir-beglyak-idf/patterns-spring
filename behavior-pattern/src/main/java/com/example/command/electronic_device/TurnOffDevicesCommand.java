package com.example.command.electronic_device;

import java.util.List;

public class TurnOffDevicesCommand implements Command {

    private List<ElectronicDevice> electronicDevices;

    public TurnOffDevicesCommand(List<ElectronicDevice> electronicDevices) {
        this.electronicDevices = electronicDevices;
    }

    @Override
    public void execute() {
        electronicDevices.forEach(ElectronicDevice::off);
    }
}
