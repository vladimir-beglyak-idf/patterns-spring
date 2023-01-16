package com.example.command.lambda_command;

public class CopyCommand implements Command {

    private final InputOutputDevice device;

    public CopyCommand(InputOutputDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.copy();
    }
}
