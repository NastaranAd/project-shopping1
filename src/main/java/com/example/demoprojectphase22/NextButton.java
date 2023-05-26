package com.example.demoprojectphase22;

import Exception.*;
import Model.Admin1;
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

public class NextButton {
    signIn user = new signIn();
    @FXML
    private TextField productName;

    @FXML
    private Button backButton;

    @FXML
    private Button search;

    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("ShopProduct.fxml")));
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void searchButton(MouseEvent event) {
        String name10 = productName.getText();
        try {
            user.Shopping(name10,Customer.getIndex());
        } catch (LackOfMoney |OutOfProduct| InvalidDiscountCode | InvalidDiscountCapacity e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle(e.getMessage());
            alert.setContentText("WRONG INFORMATION");
            alert.showAndWait();
        }
    }

}
