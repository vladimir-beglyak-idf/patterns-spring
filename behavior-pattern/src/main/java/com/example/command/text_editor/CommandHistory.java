package com.example.command.text_editor;

import java.util.ArrayDeque;
import java.util.Queue;
import lombok.Getter;

@Getter
public class CommandHistory {

  private final Queue<Command> history = new ArrayDeque<>();

  public boolean push(Command command) {
    return history.add(command);
  }

  public Command pop() {
    return history.peek();
  }
}
