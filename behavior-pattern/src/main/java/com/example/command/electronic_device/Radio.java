package com.example.command.electronic_device;

public class Radio implements ElectronicDevice {

    private int volume;
    private final DeviceType deviceType = DeviceType.RADIO;

    @Override
    public void on() {
        System.out.println("Radio is on");
    }

    @Override
    public void off() {
        System.out.println("Radio is off");
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
