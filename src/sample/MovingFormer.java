package sample;


import javafx.scene.image.ImageView;

public class MovingFormer implements Runnable{
    Elevator elevator;
    ImageView imageView;

    public MovingFormer(Elevator elevator, ImageView imageView) {
        this.elevator = elevator;
        this.imageView = imageView;
    }


    @Override
    public void run() {
        while (true) {

//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            if (elevator.getMoveDirection() == 1 /*elevator.getMoveDirection() != 0*/) {
                for (int i = elevator.getCurrentFloor() + 1; i < elevator.getFloorsNum(); i++) {
                    if (elevator.getFloors().get(i) == 1 || elevator.getFloors().get(i) == 3) {
                        System.out.println(elevator.getFloors().get(i));
                        System.out.println("Maybedifferent!");
                        //TODO: move(i, imageView, currentFloor);
                        MoveElevator moveElevator = new MoveElevator(i, imageView, elevator.getCurrentFloor());
                        Thread t = new Thread(moveElevator);
                        t.start();
                        try {
                            Thread.sleep(Math.abs(elevator.getCurrentFloor() - i) * 500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        try {
                            t.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        elevator.switchOffFloorsState(i, 1);
                    }   //TODO: "if *up* is under elevator and reverse in if downwards"
                }
            } else if (elevator.getMoveDirection() == 2) {
                for (int j = elevator.getCurrentFloor(); j > -1; j--) {
                    if (elevator.getFloors().get(j) == 2 || elevator.getFloors().get(j) == 3) {
                        //TODO: move(j), imageView, currentFloor);
                        MoveElevator moveElevator = new MoveElevator(j, imageView, elevator.getCurrentFloor());
                        Thread t = new Thread(moveElevator);
                        t.start();
                        try {
                            t.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        try {
                            Thread.sleep(Math.abs(elevator.getCurrentFloor() - j) * 500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        try {
                            t.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        elevator.switchOffFloorsState(j, 2);
                        System.out.println("switched");
                    }
                }
            } else {
                elevator.setMoveDirection(2);
            }



        }
    }
}

//if (elevator.getMoveDirection() == 1 /*elevator.getMoveDirection() != 0*/) {
//        for (int i = elevator.getCurrentFloor() + 1; i < elevator.getFloorsNum(); i++) {
//        if (elevator.getFloors().get(i) == 1 || elevator.getFloors().get(i) == 3) {
//        elevator.setCallOnTheWay(i);
//        break;
//        } else {
//        // if there is no of MOVE UP, search MOVE DOWN
//        for (int j = elevator.getFloorsNum() - 1; j > -1; j--) {
//        if (elevator.getFloors().get(j) == 2 || elevator.getFloors().get(j) == 3) {
//        elevator.setCallOnTheWay(i);
//        break;
//        }
//        }
//        }
//        }
//        if (elevator.getCallOnTheWay() != 0) {
//        //TODO: move(floor: callOnTheWay, currentFloor, direction: moveDirection)
//        moveElevator(elevator.getCallOnTheWay(), elevator.getCurrentFloor());
//        System.out.println("end?");
//        elevator.setCurrentFloor(elevator.getCallOnTheWay());
//        elevator.setCallOnTheWay(0);
//        } else {
//        //TODO: endMove ---> direction = 0 // if there is no floors to go
//        elevator.setMoveDirection(0);
//        }
//        } else {
//        //TODO: if moveDirection == 0
////                    for (int i = 0; i < elevator.getCurrentFloor(); i++) {
////                        elevator.setCallOnTheWay(elevator.getCallOnTheWay() + 1);
////                    }
//        }