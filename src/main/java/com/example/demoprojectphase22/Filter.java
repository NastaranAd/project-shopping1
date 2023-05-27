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

public class Filter {
    @FXML
    private Button category;

    @FXML
    private Button dimension;

    @FXML
    private Button weight;

    @FXML
    private Button country;

    @FXML
    private Button color;

    @FXML
    private Button price;

    @FXML
    private Button company;

    @FXML
    private Button name;

    @FXML
    private Button capacity;

    @FXML
    void filterByCapacity(MouseEvent event) {

    }

    @FXML
    void filterByCompany(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("company.fxml")));
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void filterByCountry(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("country.fxml")));
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void filterByDimension(MouseEvent event) {

    }

    @FXML
    void filterByPrice(MouseEvent event) {

    }

    @FXML
    void filterBycolor(MouseEvent event) {

    }

    @FXML
    void filterbycategory(MouseEvent event) {

    }

    @FXML
    void filterbyweight(MouseEvent event) {

    }

    @FXML
    void searchName(MouseEvent event) {

    }

}
