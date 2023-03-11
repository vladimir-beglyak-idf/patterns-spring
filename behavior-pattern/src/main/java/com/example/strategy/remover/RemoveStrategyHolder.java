package com.example.strategy.remover;

import java.util.HashMap;
import java.util.Map;

public final class RemoveStrategyHolder {

  private static final Map<RemoveType, RemoveStrategy> removeStrategyMap = new HashMap<>();

  private RemoveStrategyHolder() {

  }

  static {
    NumberRemover numberRemover = new NumberRemover();
    removeStrategyMap.put(RemoveType.NUMBER, numberRemover);
    WhitespaceRemover whitespaceRemover = new WhitespaceRemover();
    removeStrategyMap.put(RemoveType.WHITE_SPACE, whitespaceRemover);
  }

  public static RemoveStrategy get(RemoveType removeType) {
    return removeStrategyMap.get(removeType);
  }
}
