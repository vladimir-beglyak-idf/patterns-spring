package com.example.command.text_editor;

public class TextEditorRunner {

  public static void main(String[] args) {
    Application application = new Application();
    application.createUI();
    Editor activeEditor = application.getActiveEditor();
    String first = activeEditor.getSelection();

    application.setClipboard("Hello world");
    Button button = application.getButton(ShortcutType.CUT);

    boolean result = application.executeCommand(button.getCommand());
    application.executeCommand(application.getButton(ShortcutType.UNDO).getCommand());
    String currentText = application.getActiveEditor().getSelection();
    System.out.println(currentText);
    System.out.println(application.getHistory().getHistory().size());

    Editor editor = new Editor("Privet");
    String selection = editor.getSelection();
    System.out.println(selection);
    editor.replaceSelection("Poka");
    String selection1 = editor.getSelection();
    System.out.println(selection1);
    editor.deleteSelection();
    System.out.println(editor.getSelection());
  }
}
