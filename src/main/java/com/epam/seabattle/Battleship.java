package com.epam.seabattle;

public class Battleship extends Ship {

    public Battleship() {
        length = 4;
        body = new OurOptions[length];
        fillBody();
    }
}