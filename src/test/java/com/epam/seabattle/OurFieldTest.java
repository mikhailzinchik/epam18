package com.epam.seabattle;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

public class OurFieldTest {
    private OurField gameMap;

    @Before
    public void setUp() {
        gameMap = new OurField();
    }

    @Test
    public void testHowManyShipsLeft() {
        assertEquals(10, OurField.countHowManyShipsLeft(gameMap));
    }

    @Test
    public void testGetShipFromMap() {
        OurOptions[][] cells = gameMap.getCells();
        int y = 0;
        int x = 0;
        if (cells[y][x].getState() == ParametersOfOurGame.SHIP) {
            Ship ship = OurField.getShipFromMap(gameMap, y, x);
            assertNotNull(ship);
            assertSame(ship, OurField.getShipFromMap(gameMap, y, x));
        } else {
            Ship ship = OurField.getShipFromMap(gameMap, y, x);
            assertNull(ship);
        }
    }
}
