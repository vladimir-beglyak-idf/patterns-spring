package com.example.command.room;

import lombok.Data;

@Data
public class Light {
    private boolean switchedOn;

    public void switchLights() {
        switchedOn = !switchedOn;
    }
}
