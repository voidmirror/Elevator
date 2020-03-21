package sample;

import java.util.ArrayList;

public class Elevator {
    /**
     * 0 - none, 1 - upwards, 2 - downwards, 3 - both
     * The same, if it is called internally
     */
    private ArrayList<Integer> floors;

    private int floorsNum = 9;

    /**
     * 0 - none, 1 - upwards, 2 - downwards
     */
    private int moveDirection = 0;

    private int currentFloor = 0;
    private int callNum = 0;
    private int callUpNow = 0;
    private int callDownNow = 0;
    private int callOnTheWay = 0;

    public Elevator() {
        floors = new ArrayList<>(floorsNum);
        for (int i = 0; i < floorsNum; i++) {
            floors.add(0);
        }
    }

    public ArrayList<Integer> getFloors() {
        return floors;
    }

    public void printFloors() {
        for (int i = 0; i < floorsNum; i++) {
            System.out.print(floors.get(i) + " ");
        }
        System.out.println();
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

    public int getCallOnTheWay() {
        return callOnTheWay;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setCallNum(int callNum) {
        this.callNum = callNum;
    }

    public void setCallOnTheWay(int callOnTheWay) {
        this.callOnTheWay = callOnTheWay;
    }

    public void switchOnFloorsState(int targetFloor, int direction) {
        if (floors.get(targetFloor) != 0) {
            if (direction == 1) {
                if (floors.get(targetFloor) == 2) {
                    floors.set(targetFloor, 3);
                    callNum++;
                }
            } else {
                if (floors.get(targetFloor) == 1) {
                    floors.set(targetFloor, 3);
                    callNum++;
                }
            }
        } else {
            floors.set(targetFloor, direction);
            callNum++;
        }
        System.out.println(callNum);
    }

    public void switchOffFloorsState(int targetFloor, int direction) {
        if (floors.get(targetFloor) == 3) {
            if (direction == 2) {
                floors.set(targetFloor, 1);
            } else {
                floors.set(targetFloor, 2);
            }
        } else {
            floors.set(targetFloor, 0);
        }
        callNum--;  // check on practice (structure)
    }

    public void pressedBtnReaction(PressedBtn pressedBtn, boolean isSelected) {
        if (isSelected) {
            switchOnFloorsState(pressedBtn.getTargetFloor(), pressedBtn.getDirection());
        } else {
            switchOffFloorsState(pressedBtn.getTargetFloor(), pressedBtn.getDirection());
        }
        printFloors();
        System.out.println();
    }

    public boolean checkCallNum() {
        return callNum != 0;
    }


}
