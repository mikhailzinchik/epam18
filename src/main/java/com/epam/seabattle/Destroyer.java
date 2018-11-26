package com.epam.seabattle;



public class Destroyer extends Ship {

    public Destroyer() {
        length = 2;
        body = new OurOptions[length];
        fillBody();
    }
}