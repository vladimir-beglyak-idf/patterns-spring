package com.example.chain_of_responsibility;

public enum Priority {
    ROUTINE(1), IMPORTANT(2), ASAP(3);
    private final int value;

    Priority(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
