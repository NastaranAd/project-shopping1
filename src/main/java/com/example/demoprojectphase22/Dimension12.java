package com.example.demoprojectphase22;

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

public class Dimension12 {
    @FXML
    private TextField max;

    @FXML
    private TextField min;

    @FXML
    private Button submitButton;

    @FXML
    private Button backButton;

    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("filter.fxml")));
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void submitButtom(MouseEvent event) {

    }
}
