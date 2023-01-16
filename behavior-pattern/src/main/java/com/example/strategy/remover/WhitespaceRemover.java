package com.example.strategy.remover;

public class WhitespaceRemover implements RemoveStrategy{
    @Override
    public String execute(String input) {
        return input.replaceAll("\\s", "");
    }
}
