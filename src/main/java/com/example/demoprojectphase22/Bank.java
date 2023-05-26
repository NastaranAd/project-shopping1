package com.example.demoprojectphase22;

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
import Model.*;
import View.*;
import java.io.IOException;
import java.util.Objects;

public class Bank {
    signIn helper5 = new signIn();
    @FXML
    private TextField cash;

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
    private Button money;


    @FXML
    void moneyRequest(MouseEvent event) throws IOException {
        double money= Double.parseDouble(cash.getText());
        Request200 request70 = new Request200(Admin1.getAdmin1().getShoppers().get(Customer.getIndex()).getUserName(), money);
        Admin1.getAdmin1().getRequest200().add(request70);
        Request200 request200 = new Request200(Customer.getIndex());
        Admin1.getAdmin1().getRequest200().add(request200);

        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("cart.fxml")));
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();


    }
}
