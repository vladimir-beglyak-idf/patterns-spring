package com.example.strategy.navigator;

public class PublicTransportStrategy implements RouteStrategy {

  @Override
  public void buildRoute(String startPoint, String finishPoint) {
    System.out.println(String.format("Distant from %s to %s is 3 km and it take 10 minutes by bus number 15",
        startPoint, finishPoint));
  }
}
