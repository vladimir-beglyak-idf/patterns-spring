package com.example.strategy.navigator;

public class NavigatorRunner {

  public static void main(String[] args) {
    Navigator navigator = new Navigator();
    RouteStrategyFactory.init();

    navigator.setRouteStrategy(RouteStrategyFactory.define(RouteStrategyType.DRIVING));
    navigator.buildRoute("Malinovka", "Nemiga");

    navigator.setRouteStrategy(RouteStrategyFactory.define(RouteStrategyType.WALKING));
    navigator.buildRoute("Malinovka", "Nemiga");
  }
}
