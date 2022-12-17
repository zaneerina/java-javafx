package com.example.start;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    // create a reference to our xml textField object from hello-view.fxml file
    private TextField textField;

    @FXML
    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//        modify the output based on input from textField:
        // %s for a placeholder and then placeholder value as the second variable
        welcomeText.setText(String.format("Hello %s ! Welcome to JavaFX Application!", textField.getText()));
    }
}