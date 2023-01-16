package com.example.observer.fire_station;

import java.util.ArrayList;
import java.util.List;

public class FireStation implements FireStationRegister {

    private final List<FireObserver> fireObservers = new ArrayList<>();

    @Override
    public void registerFireStation(FireObserver fireObserver) {
        fireObservers.add(fireObserver);
    }

    @Override
    public void notifyFireStations(String address) {
        fireObservers.forEach(fireObserver -> fireObserver.fire(address));
    }
}
