package com.example.command.text_editor;

public class PasteCommand extends Command {

  public PasteCommand(Application app, Editor editor) {
    super(app, editor);
  }

  @Override
  protected boolean execute() {
    saveBackup();
    editor.replaceSelection(app.getClipboard());
    return true;
  }
}
