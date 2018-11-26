package com.epam.seabattle;

import java.util.Random;

/**
 * This abstract class provides variables and method for all concrete Ships classes.
 * {@code resetCount} is used to lock the random direction when putting the ship on the map if it happens for more than
 * 10 times. In case if map will be filled in some awkward way.
 * {@code body}     is an array of OurOptions class. It ties together ships and map.
 * {@code @length}  length of a ship. Each concrete Ship class represents its own length.
 * {@code orientation}  is used to decide how to put the ship on map.
 * {@code health}   each ship starts being Healthy. Upon hit, it becomes Injured. And when hits are equal to body length
 * is becomes Dead.
 * {@code orientationLock} see resetCount.
 * {@code hitCount} counts the hits for the health state.
 */
public abstract class Ship implements ShipBehavior {
    private static int resetCount = 0;
    protected OurOptions[] body;
    protected int length;
    private Orientation orientation;
    private Health health = Health.HEALTHY;
    private boolean orientationLock;
    private int hitCount;

    public enum Health {
        HEALTHY, INJURED, DEAD
    }

    private enum Orientation {
        HORIZONTAL, VERTICAL
    }

    @Override
    public int hashCode() {
        OurOptions[] elements = getBody();
        int result = 0;
        for (int i = 0; i < elements.length; i++) {
            result += elements[i].hashCode();
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Ship other = (Ship) obj;
        OurOptions[] thisElements = getBody();
        OurOptions[] otherElements = other.getBody();
        if (thisElements.length != otherElements.length) {
            return false;
        }
        for (int i = 0; i < getBody().length; i++) {
            if (!thisElements[i].equals(otherElements[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * When a Player or a ComputerBehavior hit on a ship coordinate, this method makes all the work on
     * changing the ships state.
     *
     * @param y coordinate Y of an OurOptions in ship's body
     * @param x coordinate X of an OurOptions in ship's body
     */
    @Override
    public void markHit(int y, int x) {
        OurOptions elementToMark = new OurOptions(y, x);
        OurOptions[] elements = getBody();
        for (OurOptions element : elements) {
            if (element.equals(elementToMark)) {
                element.setSymbol('X');
                element.setCellChecked(true);
            }
        }
        hitCount++;
        if (checkIsDead()) {
            setHealth(Health.DEAD);
        } else {
            setHealth(Health.INJURED);
        }
    }

    @Override
    public boolean checkIsDead() {
        return hitCount >= body.length;
    }

    @Override
    public void fillBody() {
        for (int i = 0; i < body.length; i++) {
            body[i] = new OurOptions();
            body[i].setSymbol('O');
            body[i].setState(ParametersOfOurGame.SHIP);
        }
    }

    /**
     * This method works with the OurField's method when upon start map put's the ships on itself.
     * It sets random coordinates for ship's OurOptions body depending on the Orientation.
     */
    @Override
    public void setRandomCoordinates() {
        Random rand = new Random();
        int setOrientation = rand.nextInt(2);
        if (!orientationLock) {
            orientation = setOrientation == 0 ? Orientation.HORIZONTAL : Orientation.VERTICAL;
        }
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        if (orientation == Orientation.VERTICAL) {
            if (y > OurField.HEIGTH - body.length) {
                if (resetCount == 10) {
                    resetCount = 0;
                    orientation = Orientation.HORIZONTAL;
                    orientationLock = true;
                }
                resetCount++;
                this.resetCoordinates();
                this.setRandomCoordinates();
            } else {
                for (int i = 0; i < body.length; i++) {
                    body[i].setY(y++);
                    body[i].setX(x);
                }
            }
        } else if (orientation == Orientation.HORIZONTAL) {
            if (x > OurField.WIDTH - body.length) {
                if (resetCount == 10) {
                    resetCount = 0;
                    orientation = Orientation.VERTICAL;
                    orientationLock = true;
                }
                resetCount++;
                this.resetCoordinates();
                this.setRandomCoordinates();
            } else {
                for (int i = 0; i < body.length; i++) {
                    body[i].setY(y);
                    body[i].setX(x++);
                }
            }
        }
    }

    public Health getHealth() {
        return health;
    }

    public OurOptions getElementByCoordinates(int y, int x) {
        OurOptions element = new OurOptions(y, x);
        for (OurOptions elementToFind : getBody()) {
            if (elementToFind.equals(element)) {
                return elementToFind;
            }
        }
        return null;
    }

    public int getLength() {
        return length;
    }

    public OurOptions[] getBody() {
        return body;
    }

    private void setHealth(Health health) {
        this.health = health;
    }

    private void resetCoordinates() {
        for (int i = 0; i < body.length; i++) {
            body[i].setX(0);
            body[i].setY(0);
        }
    }
}