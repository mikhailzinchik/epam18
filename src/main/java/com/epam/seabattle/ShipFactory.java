package com.epam.seabattle;


/**
 * This Factory creates ships depending on {@code size} input.
 * It is used by OurField to initially create the ArrayList of Ships.
 * One 4-deck ship, two 3-deck ships, three 2-deck ships, four 1-deck ship.
 */
public class ShipFactory {
    public Ship createShip(int size) {
        Ship ship = null;
        switch (size) {
            case 1:
                ship = new Submarine();
                break;
            case 2:
                ship = new Destroyer();
                break;
            case 3:
                ship = new LightCruiser();
                break;
            case 4:
                ship = new Battleship();
                break;
            default:
                System.err.println("No such ship");
                break;
        }
        return ship;
    }
}