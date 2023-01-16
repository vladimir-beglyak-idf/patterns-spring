package com.example.strategy.remover;

public class NumberRemover implements RemoveStrategy{
    @Override
    public String execute(String input) {
        return input.replaceAll("\\d", "");
    }
}
