package com.example.command.text_editor;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class Editor {

  private String text;

  public String getSelection() {
    return text;
  }

  public void deleteSelection() {
    text = "";
  }

  public void replaceSelection(String text) {
    this.text = text;
  }
}
