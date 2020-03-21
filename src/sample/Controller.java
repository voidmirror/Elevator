package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Controller {
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

    public Controller() throws FileNotFoundException {
        imgElevatorOpened = new Image(new FileInputStream("src\\sample\\src\\img\\elevator_opened.jpg"));
        imgElevatorClosed = new Image(new FileInputStream("src\\sample\\src\\img\\elevator_closed.jpg"));
        elevator = new Elevator();
    }

    public void imgElevatorSwapToOpen () {
        imageViewElevator.setImage(imgElevatorOpened);
    }

    public void imgElevatorSwapToClose () {
        imageViewElevator.setImage(imgElevatorClosed);
    }

    public void pressedBtnUp7() {
        if (btnUp7.isSelected()) {
//            System.out.println("Yep");
            elevator.pressedBtnReaction(new PressedBtn(7, 1), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(7, 1), false);
        }
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
    }

    public void pressedBtnUp1() {
        if (btnUp1.isSelected()) {
            elevator.pressedBtnReaction(new PressedBtn(1, 1), true);
        } else {
            elevator.pressedBtnReaction(new PressedBtn(1, 1), false);
        }
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
}
