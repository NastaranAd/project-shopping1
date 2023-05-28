package com.example.demoprojectphase22;
import View.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class YesDone {
    signIn helper = new signIn();
    @FXML
    private TextField cartNumber;

    @FXML
    private TextField cvv2;

    @FXML
    private TextField password;

    @FXML
    private Button submitButton;

    @FXML
    private Button backButton;

    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("nextButton.fxml")));
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void submitButton(MouseEvent event) {
     String cart = cartNumber.getText();
     String pass = password.getText();
     String cvv = cvv2.getText();
     helper.Shopping1(Customer.getIndex(),cart,pass,cvv);

    }
}
