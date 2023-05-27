package com.example.demoprojectphase22;

import Exception.*;
import View.signIn;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

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
    void backButton(MouseEvent event) {

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
