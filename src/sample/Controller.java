package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Controller {
    @FXML
    private ImageView imageViewElevator;

    @FXML
    private Button btnUp8;
    @FXML
    private Button btnUp7;
    @FXML
    private Button btnUp6;
    @FXML
    private Button btnUp5;
    @FXML
    private Button btnUp4;
    @FXML
    private Button btnUp3;
    @FXML
    private Button btnUp2;
    @FXML
    private Button btnUp1;
    @FXML
    private Button btnUp0;

    @FXML
    private Button btnDown8;
    @FXML
    private Button btnDown7;
    @FXML
    private Button btnDown6;
    @FXML
    private Button btnDown5;
    @FXML
    private Button btnDown4;
    @FXML
    private Button btnDown3;
    @FXML
    private Button btnDown2;
    @FXML
    private Button btnDown1;
    @FXML
    private Button btnDown0;

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
