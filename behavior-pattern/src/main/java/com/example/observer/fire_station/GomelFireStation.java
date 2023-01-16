package com.example.observer.fire_station;

public class GomelFireStation implements FireObserver {

    private final FireStationType type = FireStationType.GOMEL;

    @Override
    public void fire(String address) {
        if (address.contains(type.name())) {
            System.out.println("На пожар выезжает команды из " + type);
        }
    }

}
