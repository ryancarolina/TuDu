package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.awt.*;

public class SignupController {
    @FXML
    private TextField signUpFirstName;

    @FXML
    private TextField signUpLastName;

    @FXML
    private TextField signUpUserName;

    @FXML
    private TextField signUpLocation;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    private PasswordField signUpPassword;

    @FXML
    private Button signUpSignUpButton;

    @FXML
    void initialize(){
        signUpSignUpButton.setOnAction(event -> {
            System.out.println("The sign up button was clicked");
        });
    }
}
