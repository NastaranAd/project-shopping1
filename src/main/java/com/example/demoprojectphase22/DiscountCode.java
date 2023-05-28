package com.example.demoprojectphase22;

import com.example.demoprojectphase22.Model.Admin1;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class DiscountCode implements Initializable {
    @FXML
    private Text DiscountCode;

    @FXML
    private Button backButton;

    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("shopperMenu.fxml")));
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (int y = 0; y<Admin1.getAdmin1().getShoppers().get(Customer.getIndex()).getDiscounts().size();y++)
        DiscountCode.setText(Admin1.getAdmin1().getShoppers().get(Customer.getIndex()).getDiscounts().get(y).getCode());
    }
}
