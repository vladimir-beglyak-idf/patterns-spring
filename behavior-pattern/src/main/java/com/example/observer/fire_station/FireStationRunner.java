package com.example.observer.fire_station;

public class FireStationRunner {
    public static void main(String[] args) {
        FireStation fireStation = new FireStation();
        fireStation.registerFireStation(new MinskFireStation());
        fireStation.registerFireStation(new GomelFireStation());
        fireStation.registerFireStation(new GrodnoFireStation());
        fireStation.notifyFireStations("Fire, MINSK, street Lenina, h. 5, GOMEL, street Heroes");
    }
}
