package com.example.command.text_editor;

public class CutCommand extends Command {

  public CutCommand(Application app, Editor editor) {
    super(app, editor);
  }

  @Override
  protected boolean execute() {
    saveBackup();
    app.setClipboard(editor.getSelection());
    editor.deleteSelection();
    return true;
  }
}
