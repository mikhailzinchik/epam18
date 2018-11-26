package com.epam.seabattle;


/**
 * This abstract class provides common fields and behavior for ComputerBehavior and Human classes.
 * <p>
 * {@code gameProcess} a GameProcess instance ties up a Player and a ComputerBehavior on a certain map.
 * {@code result}   is a hit result.
 */
public abstract class AbstractPlayer {
    protected OurField map;
    protected GameProcess gameProcess;
    protected boolean result;
    private boolean victory;

    public AbstractPlayer(GameProcess gameProcess) {
        map = new OurField();
        this.gameProcess = gameProcess;
    }

    public abstract void fire();

    public OurField getMap() {
        return map;
    }

    public boolean getVictory() {
        return victory;
    }

    public boolean getResult() {
        return result;
    }

    protected boolean checkIsItVictory(OurField map) {
        return OurField.countHowManyShipsLeft(map) == 0;
    }

    protected void waitOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void setResult(boolean result) {
        this.result = result;
    }

    protected void setVictory(boolean victory) {
        this.victory = victory;
    }
}