package com.epam.seabattle;

import java.util.ArrayList;

/**
 * This class provides the map for the game. It is used both by Player and ComputerBehavior.
 * This class also randomly puts the players' ships randomly on itself upon creation.
 */
public class OurField {
    public final static int WIDTH = 10;
    public final static int HEIGTH = 10;
    private final OurOptions[][] cells;
    private final ArrayList<Ship> ships = new ArrayList<>(10);
    private final ShipFactory factory = new ShipFactory();

    public OurField() {
        cells = new OurOptions[WIDTH][HEIGTH];
        fillMap();
        createShips();
        putShipsRandomly();
    }

    /**
     * Counts how many ship's left on some map.
     *
     * @param map an instance of OurField on which ships are counted.
     * @return the amount of ships left.
     */
    public static int countHowManyShipsLeft(OurField map) {
        ArrayList<Ship> ships = map.getShips();
        int shipsLeft = ships.size();
        for (Ship ship : ships) {
            if (ship.getHealth() == Ship.Health.DEAD) {
                shipsLeft--;
            }
        }
        return shipsLeft;
    }

    /**
     * This method provides the possibility to get an instance of Ship by the cell coordinated.
     * It is used when some player hits the ships.
     * <p>
     * Technically this method may produce a NullPointerException, but the logic of application
     * prevents from it.
     *
     * @param map an intance of OurField on which hit has happened.
     * @param y   Y coordination of ship (represented by a letter on the map).
     * @param x   X coordination of ship.
     * @return Ship instance by the coordinates
     */
    public static Ship getShipFromMap(OurField map, int y, int x) {
        ArrayList<Ship> ships = map.getShips();
        OurOptions elementToCheck = new OurOptions(y, x);
        for (Ship ship : ships) {
            OurOptions[] elements = ship.getBody();
            for (OurOptions element : elements) {
                if (elementToCheck.equals(element)) {
                    return ship;
                }
            }
        }
        return null;
    }

    /**
     * @return The original OurOptions[][] array that the OurField consists from.
     */
    public OurOptions[][] getCells() {
        return cells;
    }

    /**
     * This method simply prints the map.
     */
    public void displayMap() {
        System.out.println("--------------- My map -----------------");
        char coordinateX = 'A';
        int coordinateY = 0;

        System.out.print("  ");
        for (int x = 0; x < WIDTH; x++) {
            System.out.print(coordinateY++ + "   ");
        }
        System.out.println();

        for (int y = 0; y < HEIGTH; y++) {
            System.out.print(coordinateX++ + " ");
            for (int x = 0; x < WIDTH; x++) {
                System.out.print(cells[y][x].getSymbol() + "\t");
                if (x != 9) {
                    System.out.print("| ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * This method prints the opponent map.
     * The only difference between this and the previous methods is that this one doesn't show the cell
     * if it isn't checked (hit) yet. It is used for that the Player could not see the opponents' map cells until
     * he makes a hit.
     */
    public void displayEnemyMap() {
        System.out.println("------------- Enemy map ----------------");
        char coordinateX = 'A';
        int coordinateY = 0;

        System.out.print("  ");
        for (int x = 0; x < WIDTH; x++) {
            System.out.print(coordinateY++ + "   ");
        }
        System.out.println();

        for (int y = 0; y < HEIGTH; y++) {
            System.out.print(coordinateX++ + " ");
            for (int x = 0; x < WIDTH; x++) {
                if (!(cells[y][x].isCellChecked())) {
                    System.out.print(cells[y][x].getSurrogate() + "\t");
                } else {
                    System.out.print(cells[y][x].getSymbol() + "\t");
                }
                if (x != 9) {
                    System.out.print("| ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


    public ArrayList<Ship> getShips() {
        return ships;
    }

    /**
     * Here the initial map filling happens.
     */
    private void fillMap() {
        for (int y = 0; y < HEIGTH; y++) {
            for (int x = 0; x < WIDTH; x++) {
                cells[y][x] = new OurOptions();
                cells[y][x].setSymbol(' ');
                cells[y][x].setState(ParametersOfOurGame.WATER);
                cells[y][x].setY(y);
                cells[y][x].setX(x);
            }
        }
    }

    /**
     * This method uses Factory instance to fill the ArrayList of Ships.
     */
    private void createShips() {
        ships.add(factory.createShip(4));
        for (int i = 0; i < 2; i++) {
            ships.add(factory.createShip(3));
        }
        for (int i = 0; i < 3; i++) {
            ships.add(factory.createShip(2));
        }
        for (int i = 0; i < 4; i++) {
            ships.add(factory.createShip(1));
        }
    }

    /**
     * This method looks for the empty cells where the OurField can put ships.
     * It uses the markBoarder() and checkCoordinates() method for correct performing.
     */
    private void putShipsRandomly() {
        for (Ship ship : ships) {
            do {
                ship.setRandomCoordinates();
            } while (!checkCoordinates(cells, ship));
            for (int i = 0; i < ship.getLength(); i++) {
                OurOptions element = ship.getBody()[i];
                int elementY = element.getY();
                int elementX = element.getX();
                cells[elementY][elementX].setSymbol(element.getSymbol());
                cells[elementY][elementX].setState(element.getState());
                markBorder(cells, elementY, elementX);
            }
        }
    }

    private void markBorder(OurOptions[][] array, int y, int x) {
        OurOptions input = new OurOptions(y, x);
        ArrayList<OurOptions> surround = input.getSurround();
        for (OurOptions element : surround) {
            if (array[element.getY()][element.getX()].getState() != ParametersOfOurGame.SHIP) {
                array[element.getY()][element.getX()].setState(ParametersOfOurGame.BORDER);
            }
        }
    }

    private boolean checkCoordinates(OurOptions[][] array, Ship ship) {
        OurOptions[] shipElements = ship.getBody();
        for (OurOptions element : shipElements) {
            if (!(array[element.getY()][element.getX()].checkEmptiness())) {
                return false;
            }
            ArrayList<OurOptions> surround = element.getSurround();
            for (OurOptions elements : surround) {
                if (!(array[elements.getY()][elements.getX()].checkEmptiness())) {
                    return false;
                }
            }
        }
        return true;
    }
}