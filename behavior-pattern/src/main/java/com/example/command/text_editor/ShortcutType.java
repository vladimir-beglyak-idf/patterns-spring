package com.example.command.text_editor;

import java.util.stream.Stream;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ShortcutType {
  COPY("Ctrl + C"),
  PASTE("Ctrl + V"),
  UNDO("Ctrl + Z"),
  CUT("Ctrl + X");

  private final String shortcut;

  public static ShortcutType of(String shortcut) {
    return Stream.of(values())
        .filter(v -> v.getShortcut().equals(shortcut))
        .findFirst()
        .orElseThrow(() -> new RuntimeException("Unknown type"));
  }
}
