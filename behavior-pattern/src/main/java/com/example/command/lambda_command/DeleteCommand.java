package com.example.command.lambda_command;

public class DeleteCommand implements Command {

    private final InputOutputDevice device;

    public DeleteCommand(InputOutputDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.delete();
    }
}
