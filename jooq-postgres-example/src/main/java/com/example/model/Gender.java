package com.example.model;

import java.util.stream.Stream;

public enum Gender {
    MALE, FEMALE;

    public static Gender of(String name) {
        return Stream.of(values())
                .filter(v -> v.name().equals(name))
                .findAny()
                .orElse(null);
    }
}
