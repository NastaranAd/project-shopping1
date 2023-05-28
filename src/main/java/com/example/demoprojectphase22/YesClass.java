package com.example.demoprojectphase22;

import Exception.*;
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

public class YesClass
{
    signIn user = new signIn();
    NextButton nextButton = new NextButton();
    @FXML
    private TextField discountCode;

    @FXML
    private Button backButton;

    @FXML
    private Button submitButton;

    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("wantDiscount.fxml")));
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void submitButton(MouseEvent event) {
        String code = discountCode.getText();
        try {
            user.Shopping(nextButton.getName10(), Customer.getIndex(),"yes",code);
        } catch (LackOfMoney | OutOfProduct | InvalidDiscountCode | InvalidDiscountCapacity e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle(e.getMessage());
            alert.setContentText("WRONG INFORMATION");
            alert.showAndWait();
        }
    }

}
