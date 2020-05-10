package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class MoveElevator implements Runnable {
    int targetFloor;
    ImageView imageView;
    int currentFloor;

    public MoveElevator(int targetFloor, ImageView imageView, int currentFloor) {
        this.targetFloor = targetFloor;
        this.imageView = imageView;
        this.currentFloor = currentFloor;
    }

    @Override
    public void run() {

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(Math.abs(currentFloor - targetFloor) * 500), imageView);
        translateTransition.setFromY(imageView.getScaleY() + imageView.getTranslateY());
        System.out.println(imageView.getLayoutY() + " : scale");
        System.out.println(imageView.getScaleY() + imageView.getTranslateY());
        translateTransition.setFromX(imageView.getScaleX());
        translateTransition.setToX(imageView.getScaleX());
        translateTransition.setToY(imageView.getScaleY() + imageView.getTranslateY() + 85 * (currentFloor - targetFloor));
        System.out.println(imageView.getScaleY() + imageView.getTranslateY() + 85 * (currentFloor - targetFloor));
        translateTransition.play();
        System.out.println("ITS PLAYING");



//            System.out.println("It runs " + i + "?");
        System.out.println("yes?");


    }
}
