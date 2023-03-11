package com.example.strategy.remover;

@FunctionalInterface
public interface RemoveStrategy {

  String execute(String input);
}
