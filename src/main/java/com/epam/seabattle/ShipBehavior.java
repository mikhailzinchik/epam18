package com.epam.seabattle;

public interface ShipBehavior {
    void markHit(int y, int x);
    boolean checkIsDead();
    void setRandomCoordinates();
    void fillBody();
}