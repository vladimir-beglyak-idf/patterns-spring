package com.example.command.electronic_device;

public interface ElectronicDevice {
    void on();
    void off();
    void turnUpVolume();
    void turnDownVolume();
    DeviceType getType();
}
