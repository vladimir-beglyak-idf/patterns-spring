package com.example.strategy.navigator;

public class WalkingStrategy implements RouteStrategy {

  @Override
  public void buildRoute(String startPoint, String finishPoint) {
    System.out.println(String.format("Distant from %s to %s is 3 km and it take 1 hour", startPoint, finishPoint));
  }
}
