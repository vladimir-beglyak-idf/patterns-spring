package com.example.patternsspring.pattern.command.electronic_device;

public interface ElectronicDevice {
    void on();
    void off();
    void turnUpVolume();
    void turnDownVolume();
    DeviceType getType();
}
