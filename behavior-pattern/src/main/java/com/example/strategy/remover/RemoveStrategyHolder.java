package com.example.strategy.remover;

import java.util.HashMap;
import java.util.Map;

public final class RemoveStrategyHolder {

    private static final Map<RemoveType, RemoveStrategy> removeStrategyMap = new HashMap<>();

    private RemoveStrategyHolder() {

    }

    static {
        removeStrategyMap.put(RemoveType.NUMBER, new NumberRemover());
        removeStrategyMap.put(RemoveType.WHITE_SPACE, new WhitespaceRemover());
    }

    public static RemoveStrategy get(RemoveType removeType) {
        return removeStrategyMap.get(removeType);
    }
}
