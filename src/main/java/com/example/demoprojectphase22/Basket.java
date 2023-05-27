package com.example.demoprojectphase22;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Basket {
    @FXML
    private Button store;

    @FXML
    private Button basket;

    @FXML
    private Button back;

    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("shopperMenu.fxml")));
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void basket(MouseEvent event) {

    }

    @FXML
    void store(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ShopProduct.fxml")));
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}