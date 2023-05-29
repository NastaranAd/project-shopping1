package com.example.demoprojectphase22;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import View.*;
import java.io.IOException;
import java.util.Objects;

public class OpinionComment {
    signIn helper = new signIn();
    WhichProduct whichProduct = new WhichProduct();
    @FXML
    private TextField score;

    @FXML
    private TextField comment;

    @FXML
    private Button submitButton;

    @FXML
    private Button backButton;

    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("whichProduct.fxml")));
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void submitButton(MouseEvent event) {
        String comment1 = comment.getText();
        int number = Integer.parseInt(score.getText());
        helper.showOpinion(whichProduct.getWhichProduct().getText(),Customer.getIndex(),comment1,number);
    }

}
