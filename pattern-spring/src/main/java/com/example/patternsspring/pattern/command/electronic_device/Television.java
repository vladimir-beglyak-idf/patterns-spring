package com.example.patternsspring.pattern.command.electronic_device;

public class Television implements ElectronicDevice {

    private int volume;
    private final DeviceType deviceType = DeviceType.TV;

    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }

    @Override
    public void turnUpVolume() {
        volume++;
        System.out.println("Volume is " + volume);
    }

    @Override
    public void turnDownVolume() {
        volume--;
        System.out.println("Volume is " + volume);
    }

    @Override
    public DeviceType getType() {
        return deviceType;
    }
}
