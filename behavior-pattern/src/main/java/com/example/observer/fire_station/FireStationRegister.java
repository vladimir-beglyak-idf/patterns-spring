package com.example.observer.fire_station;

public interface FireStationRegister {
    void registerFireStation(FireObserver fireObserver);
    void notifyFireStations(String address);
}
