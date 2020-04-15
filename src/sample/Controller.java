package sample;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.*;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import static java.lang.Math.abs;
import static java.lang.Math.subtractExact;

public class Controller implements Initializable {
    @FXML
    private ImageView imageViewElevator;

    @FXML
    private ToggleButton btnUp8;
    @FXML
    private ToggleButton btnUp7;
    @FXML
    private ToggleButton btnUp6;
    @FXML
    private ToggleButton btnUp5;
    @FXML
    private ToggleButton btnUp4;
    @FXML
    private ToggleButton btnUp3;
    @FXML
    private ToggleButton btnUp2;
    @FXML
    private ToggleButton btnUp1;
    @FXML
    private ToggleButton btnUp0;

    @FXML
    private ToggleButton btnDown8;
    @FXML
    private ToggleButton btnDown7;
    @FXML
    private ToggleButton btnDown6;
    @FXML
    private ToggleButton btnDown5;
    @FXML
    private ToggleButton btnDown4;
    @FXML
    private ToggleButton btnDown3;
    @FXML
    private ToggleButton btnDown2;
    @FXML
    private ToggleButton btnDown1;
    @FXML
    private ToggleButton btnDown0;

    Image imgElevatorOpened;
    Image imgElevatorClosed;
    Elevator elevator;


//    public Controller() throws FileNotFoundException {
//
//    }

    public void imgElevatorSwapToOpen () {
        imageViewElevator.setImage(imgElevatorOpened);
    }

    public void imgElevatorSwapToClose () {
        imageViewElevator.setImage(imgElevatorClosed);
    }

    public void pressedBtnUp7() {
        if (btnUp7.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(7, 1), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(7, 1), false);
        }
//        mainCycle();
    }

    public void pressedBtnUp6() {
        if (btnUp6.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(6, 1), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(6, 1), false);
        }
    }

    public void pressedBtnUp5() {
        if (btnUp5.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(5, 1), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(5, 1), false);
        }
    }

    public void pressedBtnUp4() {
        if (btnUp4.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(4, 1), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(4, 1), false);
        }
    }

    public void pressedBtnUp3() {
        if (btnUp3.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(3, 1), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(3, 1), false);
        }
    }

    public void pressedBtnUp2() {
        if (btnUp2.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(2, 1), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(2, 1), false);
        }
//        mainCycle();
    }

    public void pressedBtnUp1() {
        if (btnUp1.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(1, 1), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(1, 1), false);
        }
//        mainCycle();
    }

    public void pressedBtnUp0() {
        if (btnUp0.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(0, 1), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(0, 1), false);
        }
    }

    public void pressedBtnDown8() {
        if (btnDown8.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(8, 2), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(8, 2), false);
        }
    }

    public void pressedBtnDown7() {
        if (btnDown7.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(7, 2), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(7, 2), false);
        }
    }

    public void pressedBtnDown6() {
        if (btnDown6.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(6, 2), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(6, 2), false);
        }
    }

    public void pressedBtnDown5() {
        if (btnDown5.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(5, 2), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(5, 2), false);
        }
    }

    public void pressedBtnDown4() {
        if (btnDown4.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(4, 2), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(4, 2), false);
        }
    }

    public void pressedBtnDown3() {
        if (btnDown3.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(3, 2), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(3, 2), false);
        }
    }

    public void pressedBtnDown2() {
        if (btnDown2.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(2, 2), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(2, 2), false);
        }
    }

    public void pressedBtnDown1() {
        if (btnDown1.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(1, 2), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(1, 2), false);
        }
    }

    public void testMove() {
        moveElevator(4, elevator.getCurrentFloor());
    }

    AnimationTimer animationTimer = new AnimationTimer() {
        @Override
        public void handle(long l) {
            checkAnimation();
        }
    };

    public void checkAnimation() {
        if (imageViewElevator.getTranslateY() == elevator.getCallOnTheWay() * (-85)) {
            animationTimer.stop();
        }
    }

    public void moveElevator(int targetFloor, int currentFloor) {
        System.out.println(targetFloor + " " + currentFloor);
        System.out.println(imageViewElevator.getLayoutX() + " " + imageViewElevator.getLayoutY());
        int diff = (targetFloor - currentFloor);
        System.out.println(diff);
        System.out.println("stopped");



        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(500 * abs(diff)), imageViewElevator);
        translateTransition.setFromY(imageViewElevator.getScaleY() - 1 + 85 * (0 - currentFloor));
        translateTransition.setToY(imageViewElevator.getScaleY() - 1 + 85 * (0 - currentFloor) - 85 * diff);

        System.out.println("layout: " + imageViewElevator.getLayoutY() + " scale: " + imageViewElevator.getScaleY() + " translate: " + imageViewElevator.getTranslateY());
        double currentScaleY = imageViewElevator.getScaleY() - 1 + 85 * (0 - currentFloor);
        System.out.println("currentScaleY: " + currentScaleY);
        double targetScaleY = imageViewElevator.getScaleY() - 1 + 85 * (0 - currentFloor) - 85 * diff;
        System.out.println("targetScaleY: " + targetScaleY);
        animationTimer.start();
        translateTransition.play();

//        while (currentScaleY != targetScaleY) {
//            currentScaleY = imageViewElevator.getScaleY();
//            if (currentScaleY == targetScaleY) {
//                animationTimer.stop();
//                break;
//            }
//        }

        System.out.println(imageViewElevator.getLayoutX() + " " + imageViewElevator.getLayoutY());

        if (diff > 0) {
            elevator.switchOffFloorsState(targetFloor, 1);
        } else {
            elevator.switchOffFloorsState(targetFloor, 2);
        }
    }



    public void mainCycle() {
//        if (elevator.checkCallNum()) {
//            while(/*elevator.getCallNum() != 0*/ elevator.getMoveDirection() == 0) {
//                // cycle
//                System.out.println("cycle start");
////                System.out.println(elevator.getMoveDirection());
//                elevator.setCallOnTheWay(0);
//                elevator.setMoveDirection(1);   // DELETE !!
//                if (elevator.getMoveDirection() == 1 /*elevator.getMoveDirection() != 0*/) {
//                    for (int i = elevator.getCurrentFloor() + 1; i < elevator.getFloorsNum(); i++) {
//                        if (elevator.getFloors().get(i) == 1 || elevator.getFloors().get(i) == 3) {
//                            elevator.setCallOnTheWay(i);
//                            break;
//                        } else {
//                            // if there is no of MOVE UP, search MOVE DOWN
//                            for (int j = elevator.getFloorsNum() - 1; j > -1; j--) {
//                                if (elevator.getFloors().get(j) == 2 || elevator.getFloors().get(j) == 3) {
//                                    elevator.setCallOnTheWay(i);
//                                    break;
//                                }
//                            }
//                        }
//                    }
//                    if (elevator.getCallOnTheWay() != 0) {
//                        //TODO: move(floor: callOnTheWay, currentFloor, direction: moveDirection)
//                        moveElevator(elevator.getCallOnTheWay(), elevator.getCurrentFloor());
//                        System.out.println("end?");
//                        elevator.setCurrentFloor(elevator.getCallOnTheWay());
//                        elevator.setCallOnTheWay(0);
//                    } else {
//                        //TODO: endMove ---> direction = 0 // if there is no floors to go
//                        elevator.setMoveDirection(0);
//                    }
//                } else {
//                    //TODO: if moveDirection == 0
////                    for (int i = 0; i < elevator.getCurrentFloor(); i++) {
////                        elevator.setCallOnTheWay(elevator.getCallOnTheWay() + 1);
////                    }
//                }
////                System.out.println(elevator.getMoveDirection());
//                System.out.println("cycle end");
//
//            }
//        } else {
//            System.out.println("it is 0");
//        }
//
//        System.out.println("layout: " + imageViewElevator.getLayoutY() + " scale: " + imageViewElevator.getScaleY() + " translate: " + imageViewElevator.getTranslateY());
//        elevator.setMoveDirection(1);   // DELETE !!
//        System.out.println("finished");



    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            imgElevatorOpened = new Image(new FileInputStream("src\\sample\\src\\img\\elevator_opened.jpg"));
            imgElevatorClosed = new Image(new FileInputStream("src\\sample\\src\\img\\elevator_closed.jpg"));
            imageViewElevator = new ImageView();
            imageViewElevator.setImage(imgElevatorClosed);
            elevator = new Elevator();
            elevator.setMoveDirection(1);
            MovingFormer movingFormer = new MovingFormer(elevator, imageViewElevator);
            Thread t = new Thread(movingFormer);
            t.start();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
