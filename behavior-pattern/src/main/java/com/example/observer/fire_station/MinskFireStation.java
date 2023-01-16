package com.example.observer.fire_station;

public class MinskFireStation implements FireObserver {

    private final FireStationType type = FireStationType.MINSK;

    @Override
    public void fire(String address) {
        if (address.contains(type.name())) {
            System.out.println("На пожар выезжает команды из " + type);
        }
    }
}
