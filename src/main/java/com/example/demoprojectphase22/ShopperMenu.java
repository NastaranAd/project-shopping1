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

public class ShopperMenu {

    @FXML
    private Button Account;

    @FXML
    private Button receipt;

    @FXML
    private Button search;

    @FXML
    private Button discountCode;

    @FXML
    private Button shopping;

    @FXML
    private Button products;

    @FXML
    private Button bank;

    @FXML
    void Account(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("changing.fxml")));
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void ShoppingMenu1(MouseEvent event) {

    }

    @FXML
    void bankAccount(MouseEvent event) {

    }

    @FXML
    void discountCode(MouseEvent event) {

    }

    @FXML
    void receipt(MouseEvent event) {

    }

    @FXML
    void searching(MouseEvent event) {

    }

    @FXML
    void showingProducts(MouseEvent event) {

    }
}
