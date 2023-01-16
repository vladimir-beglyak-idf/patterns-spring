package com.example.command.lambda_command;

public class DeviceCommandRunner {
    public static void main(String[] args) {
        UsbDisk usbDisk = new UsbDisk();
        Sequence sequence = new Sequence();
        sequence.addCommand(new CopyCommand(usbDisk));
        sequence.addCommand(new MoveCommand(usbDisk));
        sequence.executeLastCommand();
        System.out.println("-------------------------");
        sequence.addCommand(new DeleteCommand(usbDisk));
        sequence.executeLastCommand();
        System.out.println("-------------------------");
        sequence.runCommands();

        System.out.println("*************************");

        sequence.addCommand(usbDisk::delete);
        sequence.addCommand(usbDisk::copy);
        sequence.addCommand(usbDisk::move);
        sequence.runCommands();
    }
}
