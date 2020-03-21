package sample;

public class PressedBtn {
    private int targetFloor;
    private int direction;

    public PressedBtn(int targetFloor, int direction) {
        this.targetFloor = targetFloor;
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public int getTargetFloor() {
        return targetFloor;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void setTargetFloor(int targetFloor) {
        this.targetFloor = targetFloor;
    }
}
