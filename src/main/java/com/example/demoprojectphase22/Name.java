package com.example.demoprojectphase22;

import Controller.Shopper;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Name {
    Shopper shopper = new Shopper();
    @FXML
    private Button searchButton;

    @FXML
    private Button backButton;

    @FXML
    private TextField productName;
    @FXML
    private TextArea nameArea;


    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("filter.fxml")));
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void searchButton(MouseEvent event) {
        String name = productName.getText();
        String name1 = shopper.searchByName(name);
        nameArea.setText(name1);
    }
}
