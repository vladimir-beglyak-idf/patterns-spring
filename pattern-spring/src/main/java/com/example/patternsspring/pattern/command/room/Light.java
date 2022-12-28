package com.example.patternsspring.pattern.command.room;

import lombok.Data;

@Data
public class Light {
    private boolean switchedOn;

    public void switchLights() {
        switchedOn = !switchedOn;
    }
}
