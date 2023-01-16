package com.example.command.lambda_command;

import java.util.Stack;

public class Sequence {

    private final Stack<Command> commands = new Stack<>();

    public void addCommand(Command command) {
        commands.push(command);
    }

    public void executeLastCommand() {
        commands.peek().execute();
    }

    public void runCommands() {
        commands.forEach(Command::execute);
    }

    public void clearCommands(Command command) {
        commands.removeElement(command);
    }
}
