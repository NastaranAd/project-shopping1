package com.example.demoprojectphase22;

import Controller.Shopper;
import com.example.demoprojectphase22.Model.Product;
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

public class Category {
    Shopper shopper = new Shopper();
    @FXML
    private TextField category;

    @FXML
    private Button searchButton;

    @FXML
    private Button backButton;

    @FXML
    private TextArea categoryArea;

    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("filter.fxml")));
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void searchButton(MouseEvent event) {
     String category1 = category.getText();
     String category2 = shopper.filterByCategory(Product.category.valueOf(category1));
     categoryArea.setText(category2);
    }

}
