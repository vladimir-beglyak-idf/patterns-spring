package com.example.observer.fire_station;

public class GrodnoFireStation implements FireObserver {

    private final FireStationType type = FireStationType.GRODNO;

    @Override
    public void fire(String address) {
        if (address.contains(type.name())) {
            System.out.println("На пожар выезжает команды из " + type);
        }
    }
}
