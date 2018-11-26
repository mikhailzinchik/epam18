package com.epam.seabattle;

public class LightCruiser extends Ship {

    public LightCruiser() {
        length = 3;
        body = new OurOptions[length];
        fillBody();
    }
}