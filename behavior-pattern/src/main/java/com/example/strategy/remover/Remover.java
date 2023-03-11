package com.example.strategy.remover;

public final class Remover {

  private Remover() {

  }

  public static String remove(String input, RemoveStrategy removeStrategy) {
    return removeStrategy.execute(input);
  }
}
