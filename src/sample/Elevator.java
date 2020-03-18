package sample;

import java.util.ArrayList;

public class Elevator {
    // 0 - none, 1 - upwards, 2 - downwards
    private ArrayList<Integer> floors;
    private int floorsNum = 9;
    // 0 - none, 1 - upwards, 2 - downwards
    private int direction = 0;
    private int currentFloor = 0;
    private int callNum = 0;
//    private int

    public Elevator() {
        floors = new ArrayList<Integer>(floorsNum);
        for (int i = 0; i < floorsNum; i++) {
            floors.add(0);
        }
    }

    public ArrayList<Integer> getFloors() {
        return floors;
    }

    public int getFloorsNum() {
        return floorsNum;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
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
