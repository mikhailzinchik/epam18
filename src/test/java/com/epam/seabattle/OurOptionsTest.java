package com.epam.seabattle;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class OurOptionsTest {
    private OurOptions OurOptionsInUpLeftCorner;
    private OurOptions OurOptionsInUpRightCorner;
    private OurOptions OurOptionsInDownRightCorner;
    private OurOptions OurOptionsInDownLeftCorner;
    private OurOptions OurOptionsInCenter;
    private OurOptions OurOptionsAtLeftWall;
    private OurOptions OurOptionsAtRightWall;
    private OurOptions OurOptionsAtCeil;
    private OurOptions OurOptionsAtFloor;

    @Before
    public void setUp() {
        OurOptionsInUpLeftCorner = new OurOptions(0, 0);
        OurOptionsInUpRightCorner = new OurOptions(0, 9);
        OurOptionsInDownRightCorner = new OurOptions(9, 9);
        OurOptionsInDownLeftCorner = new OurOptions(9, 0);
        OurOptionsInCenter = new OurOptions(5, 5);
        OurOptionsAtLeftWall = new OurOptions(3, 0);
        OurOptionsAtRightWall = new OurOptions(3, 9);
        OurOptionsAtCeil = new OurOptions(0, 3);
        OurOptionsAtFloor = new OurOptions(9, 3);
    }

    @Test
    public void testGetSurround_forUpLeftCorner() {
        ArrayList<OurOptions> OurOptionss = new ArrayList<>();
        OurOptionss.add(new OurOptions(OurOptionsInUpLeftCorner.getY(), OurOptionsInUpLeftCorner.getX() + 1));
        OurOptionss.add(new OurOptions(OurOptionsInUpLeftCorner.getY() + 1, OurOptionsInUpLeftCorner.getX() + 1));
        OurOptionss.add(new OurOptions(OurOptionsInUpLeftCorner.getY() + 1, OurOptionsInUpLeftCorner.getX()));
        assertArrayEquals(OurOptionss.toArray(), OurOptionsInUpLeftCorner.getSurround().toArray());
    }

    @Test
    public void testGetSurround_forUpRightCorner() {
        ArrayList<OurOptions> OurOptionss = new ArrayList<>();
        OurOptionss.add(new OurOptions(OurOptionsInUpRightCorner.getY() + 1, OurOptionsInUpRightCorner.getX()));
        OurOptionss.add(new OurOptions(OurOptionsInUpRightCorner.getY() + 1, OurOptionsInUpRightCorner.getX() - 1));
        OurOptionss.add(new OurOptions(OurOptionsInUpRightCorner.getY(), OurOptionsInUpRightCorner.getX() - 1));
        assertArrayEquals(OurOptionss.toArray(), OurOptionsInUpRightCorner.getSurround().toArray());
    }

    @Test
    public void testGetSurround_forCeiling() {
        ArrayList<OurOptions> OurOptionss = new ArrayList<>();
        OurOptionss.add(new OurOptions(OurOptionsAtCeil.getY(), OurOptionsAtCeil.getX() - 1));
        OurOptionss.add(new OurOptions(OurOptionsAtCeil.getY() + 1, OurOptionsAtCeil.getX() - 1));
        OurOptionss.add(new OurOptions(OurOptionsAtCeil.getY() + 1, OurOptionsAtCeil.getX()));
        OurOptionss.add(new OurOptions(OurOptionsAtCeil.getY() + 1, OurOptionsAtCeil.getX() + 1));
        OurOptionss.add(new OurOptions(OurOptionsAtCeil.getY(), OurOptionsAtCeil.getX() + 1));
        assertArrayEquals(OurOptionss.toArray(), OurOptionsAtCeil.getSurround().toArray());
    }

    @Test
    public void testGetSurround_forDownRightCorner() {
        ArrayList<OurOptions> OurOptionss = new ArrayList<>();
        OurOptionss.add(new OurOptions(OurOptionsInDownRightCorner.getY() - 1, OurOptionsInDownRightCorner.getX()));
        OurOptionss.add(new OurOptions(OurOptionsInDownRightCorner.getY() - 1, OurOptionsInDownRightCorner.getX() - 1));
        OurOptionss.add(new OurOptions(OurOptionsInDownRightCorner.getY(), OurOptionsInDownRightCorner.getX() - 1));
        assertArrayEquals(OurOptionss.toArray(), OurOptionsInDownRightCorner.getSurround().toArray());
    }

    @Test
    public void testGetSurround_forDownLeftCorner() {
        ArrayList<OurOptions> OurOptionss = new ArrayList<>();
        OurOptionss.add(new OurOptions(OurOptionsInDownLeftCorner.getY() - 1, OurOptionsInDownLeftCorner.getX()));
        OurOptionss.add(new OurOptions(OurOptionsInDownLeftCorner.getY() - 1, OurOptionsInDownLeftCorner.getX() + 1));
        OurOptionss.add(new OurOptions(OurOptionsInDownLeftCorner.getY(), OurOptionsInDownLeftCorner.getX() + 1));
        assertArrayEquals(OurOptionss.toArray(), OurOptionsInDownLeftCorner.getSurround().toArray());
    }

    @Test
    public void testGetSurround_forFloor() {
        ArrayList<OurOptions> OurOptionss = new ArrayList<>();
        OurOptionss.add(new OurOptions(OurOptionsAtFloor.getY(), OurOptionsAtFloor.getX() - 1));
        OurOptionss.add(new OurOptions(OurOptionsAtFloor.getY() - 1, OurOptionsAtFloor.getX() - 1));
        OurOptionss.add(new OurOptions(OurOptionsAtFloor.getY() - 1, OurOptionsAtFloor.getX()));
        OurOptionss.add(new OurOptions(OurOptionsAtFloor.getY() - 1, OurOptionsAtFloor.getX() + 1));
        OurOptionss.add(new OurOptions(OurOptionsAtFloor.getY(), OurOptionsAtFloor.getX() + 1));
        assertArrayEquals(OurOptionss.toArray(), OurOptionsAtFloor.getSurround().toArray());
    }

    @Test
    public void testGetSurround_forLeftWall() {
        ArrayList<OurOptions> OurOptionss = new ArrayList<>();
        OurOptionss.add(new OurOptions(OurOptionsAtLeftWall.getY() - 1, OurOptionsAtLeftWall.getX()));
        OurOptionss.add(new OurOptions(OurOptionsAtLeftWall.getY() - 1, OurOptionsAtLeftWall.getX() + 1));
        OurOptionss.add(new OurOptions(OurOptionsAtLeftWall.getY(), OurOptionsAtLeftWall.getX() + 1));
        OurOptionss.add(new OurOptions(OurOptionsAtLeftWall.getY() + 1, OurOptionsAtLeftWall.getX() + 1));
        OurOptionss.add(new OurOptions(OurOptionsAtLeftWall.getY() + 1, OurOptionsAtLeftWall.getX()));
        assertArrayEquals(OurOptionss.toArray(), OurOptionsAtLeftWall.getSurround().toArray());
    }

    @Test
    public void testGetSurround_forRightWall() {
        ArrayList<OurOptions> OurOptionss = new ArrayList<>();
        OurOptionss.add(new OurOptions(OurOptionsAtRightWall.getY() - 1, OurOptionsAtRightWall.getX()));
        OurOptionss.add(new OurOptions(OurOptionsAtRightWall.getY() - 1, OurOptionsAtRightWall.getX() - 1));
        OurOptionss.add(new OurOptions(OurOptionsAtRightWall.getY(), OurOptionsAtRightWall.getX() - 1));
        OurOptionss.add(new OurOptions(OurOptionsAtRightWall.getY() + 1, OurOptionsAtRightWall.getX() - 1));
        OurOptionss.add(new OurOptions(OurOptionsAtRightWall.getY() + 1, OurOptionsAtRightWall.getX()));
        assertArrayEquals(OurOptionss.toArray(), OurOptionsAtRightWall.getSurround().toArray());
    }

    @Test
    public void testGetSurround_forCenter() {
        ArrayList<OurOptions> OurOptionss = new ArrayList<>();
        OurOptionss.add(new OurOptions(OurOptionsInCenter.getY() + 1, OurOptionsInCenter.getX() + 1));
        OurOptionss.add(new OurOptions(OurOptionsInCenter.getY() + 1, OurOptionsInCenter.getX()));
        OurOptionss.add(new OurOptions(OurOptionsInCenter.getY() + 1, OurOptionsInCenter.getX() - 1));
        OurOptionss.add(new OurOptions(OurOptionsInCenter.getY(), OurOptionsInCenter.getX() - 1));
        OurOptionss.add(new OurOptions(OurOptionsInCenter.getY() - 1, OurOptionsInCenter.getX() - 1));
        OurOptionss.add(new OurOptions(OurOptionsInCenter.getY() - 1, OurOptionsInCenter.getX()));
        OurOptionss.add(new OurOptions(OurOptionsInCenter.getY() - 1, OurOptionsInCenter.getX() + 1));
        OurOptionss.add(new OurOptions(OurOptionsInCenter.getY(), OurOptionsInCenter.getX() + 1));
        assertArrayEquals(OurOptionss.toArray(), OurOptionsInCenter.getSurround().toArray());
    }
}
