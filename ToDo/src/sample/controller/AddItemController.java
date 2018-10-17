package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class AddItemController {

    @FXML
    private ImageView addTaskButton;

    @FXML
    void initialize(){
        addTaskButton.setOnMouseClicked(event -> {
            System.out.println("The add task button was clicked");
        });
    }

}
