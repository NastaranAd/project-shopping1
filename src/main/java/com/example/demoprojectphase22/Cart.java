package com.example.demoprojectphase22;

import Controller.Shopper;
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

public class Cart {
    signIn helper5 = new signIn();

    @FXML
    private TextField cartNumber;

    @FXML
    private TextField password;

    @FXML
    private TextField cvv2;

    @FXML
    private Button submit;

    @FXML
    private Button backButton;

    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("bankAccount.fxml")));
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void submitButton(MouseEvent event) {
        String cart = cartNumber.getText();
        String password1 = password.getText();
        String cvv = cvv2.getText();
        helper5.Shopper200(cart, password1, cvv);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Money Request");
        alert.setContentText("your request has send to admin");
        alert.showAndWait();
    }
}
