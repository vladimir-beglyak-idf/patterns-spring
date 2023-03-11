package com.example.strategy.navigator;

import java.util.Map;

public class RouteStrategyFactory {

  private static Map<RouteStrategyType, RouteStrategy> routeStrategyMap;

  public static void init() {
    PublicTransportStrategy publicTransportStrategy = new PublicTransportStrategy();
    DriveStrategy driveStrategy = new DriveStrategy();
    WalkingStrategy walkingStrategy = new WalkingStrategy();
    routeStrategyMap = Map.of(
        RouteStrategyType.WALKING, walkingStrategy,
        RouteStrategyType.DRIVING, driveStrategy,
        RouteStrategyType.PUBLIC_TRANSPORT, publicTransportStrategy
    );
  }

  public static RouteStrategy define(RouteStrategyType routeStrategyType) {
    return routeStrategyMap.get(routeStrategyType);
  }
}
