package com.example.command.text_editor;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Shortcut {

  private final Map<String, Command> shortcutMap = new HashMap<>();

  public void onKeyPress(String shortcut, Command command) {
    shortcutMap.put(shortcut, command);
  }

  public boolean press(String shortcut) {
    return shortcutMap.get(shortcut).execute();
  }
}
