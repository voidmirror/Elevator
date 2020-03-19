package sample;

import java.util.ArrayList;

public class Elevator {
    /**
     * 0 - none, 1 - upwards, 2 - downwards, 3 - both
     */
    private ArrayList<Integer> floors;

    /**
     * 0 - not selected, 1 - selected
     */
    private ArrayList<Boolean> targetFloor;

    private int floorsNum = 9;

    /**
     * 0 - none, 1 - upwards, 2 - downwards
     */
    private int moveDirection = 0;

    private int currentFloor = 0;
    private int callNum = 0;
    private int callUpNow = 0;
    private int callDownNow = 0;

    public Elevator() {
        floors = new ArrayList<Integer>(floorsNum);
        for (int i = 0; i < floorsNum; i++) {
            floors.add(0);
        }

        for (int i = 0; i < floorsNum; i++) {
            targetFloor.add(false);
        }
    }

    public ArrayList<Integer> getFloors() {
        return floors;
    }

    public ArrayList<Boolean> getTargetFloor() {
        return targetFloor;
    }

    public int getFloorsNum() {
        return floorsNum;
    }

    public int getMoveDirection() {
        return moveDirection;
    }

    public int getCallNum() {
        return callNum;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getCallUpNow() {
        return callUpNow;
    }

    public int getCallDownNow() {
        return callDownNow;
    }

    public void setMoveDirection(int moveDirection) {
        this.moveDirection = moveDirection;
    }

    public void setFloors(ArrayList<Integer> floors) {
        this.floors = floors;
    }

    public void setFloorsNum(int floorsNum) {
        this.floorsNum = floorsNum;
    }

    public void calIncrease() {
        callNum++;
    }

    public void callDecrease() {
        callNum--;
    }
}
