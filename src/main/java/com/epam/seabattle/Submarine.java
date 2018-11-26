package com.epam.seabattle;



public class Submarine extends Ship {

    public Submarine() {
        length = 1;
        body = new OurOptions[length];
        fillBody();
    }
}