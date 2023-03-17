package com.example.command.text_editor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Application {

  private String clipboard;
  private List<Editor> editors;
  private Editor activeEditor;
  private CommandHistory history;
  private Shortcut shortcuts;
  private Map<ShortcutType, Button> buttons;

  public void createUI() {
    clipboard = "";
    activeEditor = new Editor(clipboard);
    shortcuts = new Shortcut();
    history = new CommandHistory();
    editors = new ArrayList<>();
    editors.add(activeEditor);
    buttons = new HashMap<>();
    CopyCommand copy = new CopyCommand(this, activeEditor);
    createButton(ShortcutType.COPY.getShortcut(), copy);

    CutCommand cut = new CutCommand(this, activeEditor);
    createButton(ShortcutType.CUT.getShortcut(), cut);

    PasteCommand paste = new PasteCommand(this, activeEditor);
    createButton(ShortcutType.PASTE.getShortcut(), paste);

    UndoCommand undo = new UndoCommand(this, activeEditor);
    createButton(ShortcutType.UNDO.getShortcut(), undo);
  }

  public boolean executeCommand(Command command) {
    if (command.execute()) {
      return history.push(command);
    }
    return false;
  }

  public void undo() {
    Command command = history.pop();
    if (command != null) {
      command.undo();
    }
  }

  public void addEditor(Editor editor) {
    editors.add(editor);
  }

  public void setClipboard(String clipboard) {
    this.clipboard = clipboard;
    activeEditor.setText(clipboard);
  }

  public Button getButton(ShortcutType shortcutType) {
    return buttons.get(shortcutType);
  }

  private void createButton(String shortcut, Command command) {
    Button button = new Button();
    button.setCommand(command);
    buttons.put(ShortcutType.of(shortcut), button);
    shortcuts.onKeyPress(shortcut, command);
  }
}
