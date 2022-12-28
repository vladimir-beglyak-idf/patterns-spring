package com.example.patternsspring.pattern.command.room;

import lombok.Data;

@Data
public class Sofa implements Furniture {

    private final FurnitureType type = FurnitureType.SOFA;

    public String description() {
        return "Scandinavian sofa";
    }
}
