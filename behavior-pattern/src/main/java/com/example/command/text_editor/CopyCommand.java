package com.example.command.text_editor;

public class CopyCommand extends Command {

  public CopyCommand(Application app, Editor editor) {
    super(app, editor);
  }

  @Override
  protected boolean execute() {
    app.setClipboard(editor.getSelection());
    return false;
  }
}
