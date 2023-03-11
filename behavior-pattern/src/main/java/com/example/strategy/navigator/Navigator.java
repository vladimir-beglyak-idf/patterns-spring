package com.example.strategy.navigator;

import lombok.Setter;

@Setter
public class Navigator {

  private RouteStrategy routeStrategy;

  public void buildRoute(String startPoint, String finishPoint) {
    routeStrategy.buildRoute(startPoint, finishPoint);
  }
}
