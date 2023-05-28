package com.example.demoprojectphase22;

import Controller.Shopper;
import com.example.demoprojectphase22.Model.Admin1;
import com.example.demoprojectphase22.Model.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.scene.control.TextArea;

public class TableViewCountry  {
    Shopper shopper = new Shopper();
    Country country100 = new Country();
    @FXML
    Button backButton;
    @FXML
    private TextArea country;
    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("country.fxml")));
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    private Button searchButton;


    @FXML
    void searchButton(MouseEvent event) {

    }


}
