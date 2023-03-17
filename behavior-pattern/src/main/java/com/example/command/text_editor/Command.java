package com.example.command.text_editor;

public abstract class Command {

  protected Application app;
  protected Editor editor;
  protected String backup;

  public Command(Application app, Editor editor) {
    this.app = app;
    this.editor = editor;
  }

  public void saveBackup() {
    backup = editor.getSelection();
  }

  public void undo() {
    editor.setText(backup);
  }

  protected abstract boolean execute();
}
