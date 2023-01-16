package com.example.command.lambda_command;

public class UsbDisk implements InputOutputDevice {
    @Override
    public void copy() {
        System.out.println("Copy data on usb...");
    }

    @Override
    public void delete() {
        System.out.println("Delete data from usb...");
    }

    @Override
    public void move() {
        System.out.println("Move data from usb to disk D...");
    }
}
