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

    public Controller() throws FileNotFoundException {
        imgElevatorOpened = new Image(new FileInputStream("src\\sample\\src\\img\\elevator_opened.jpg"));
        imgElevatorClosed = new Image(new FileInputStream("src\\sample\\src\\img\\elevator_closed.jpg"));
    }

    public void imgElevatorSwapToOpen () {
        imageViewElevator.setImage(imgElevatorOpened);
    }

    public void imgElevatorSwapToClose () {
        imageViewElevator.setImage(imgElevatorClosed);
    }
}
