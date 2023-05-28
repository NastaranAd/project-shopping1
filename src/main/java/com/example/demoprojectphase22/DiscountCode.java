package com.example.demoprojectphase22;

import Controller.Shopper;
import com.example.demoprojectphase22.Model.Admin1;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class DiscountCode {
    Shopper shopper = new Shopper();
    @FXML
    private Button searchButton;

    @FXML
    private TextArea DiscountCodeArea;
    @FXML
    private Button backButton;

    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("shopperMenu.fxml")));
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }



    @FXML
    void searchButton(MouseEvent event) {
    String discount = shopper.showDiscountCode(Customer.getIndex());
    DiscountCodeArea.setText(discount);
    }

}
