package com.example.patternsspring.pattern.command.room;

import java.util.ArrayList;
import java.util.List;

public class LivingRoom {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommand() {
        commands.forEach(Command::execute);
    }
}
