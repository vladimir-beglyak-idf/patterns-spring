package com.example.command.text_editor;

public class UndoCommand extends Command {

  public UndoCommand(Application app, Editor editor) {
    super(app, editor);
  }

  @Override
  protected boolean execute() {
    undo();
    return false;
  }
}
