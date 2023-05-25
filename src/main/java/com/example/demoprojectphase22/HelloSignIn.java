package com.example.demoprojectphase22;
import Exception.*;
import View.signIn;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloSignIn {
    signIn user = new signIn();
    @FXML
    private TextField email;

    @FXML
    private TextField password;
    @FXML
    private TextField phonenumber ;
    @FXML
    private TextField username ;
    @FXML
    private Button signinbutton;
    @FXML
    private Button back;

    @FXML
    void backing(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("main.fxml")));
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void checking(MouseEvent event)  {
        String password1 = password.getText();
        String email1 = email.getText();
        String phoneNumber1 = phonenumber.getText();
        String username1 = username.getText();

        try {
            user.signIn1(username1,email1,password1,phoneNumber1);
        } catch (InvalidEmail | InvalidPassword |InvalidPhoneNumber e) {
             Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle(e.getMessage());
             alert.setContentText("WRONG INFORMATION");
            alert.showAndWait();


        }

    }
}
