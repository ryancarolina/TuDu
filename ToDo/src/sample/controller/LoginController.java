package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class LoginController {

    @FXML
    private TextField loginUserName;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private Button loginButton;

    @FXML
    private Button loginSignUpButton;

    @FXML
    void initialize(){

        loginButton.setOnAction(event -> {
            System.out.println("Login Clicked!");
        });
    }
}
