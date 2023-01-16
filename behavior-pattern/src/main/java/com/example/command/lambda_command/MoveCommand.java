package com.example.command.lambda_command;

public class MoveCommand implements Command {

    private final InputOutputDevice device;

    public MoveCommand(InputOutputDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.move();
    }
}
