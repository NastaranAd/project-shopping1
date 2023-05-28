package com.example.demoprojectphase22;
import Controller.Shopper;
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
import Exception.*;
import java.io.IOException;
import java.util.Objects;

public class ChangePassword {
    Shopper shopper = new Shopper();
    @FXML
    private TextField password;

    @FXML
    private Button submit;

    @FXML
    private Button back;

    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("changing.fxml")));
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void newPassword(MouseEvent event) {
        String password1 = password.getText();
        try {
            shopper.changingPassword(password1);
        } catch (InvalidPassword e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle(e.getMessage());
            alert.setContentText("WRONG INFORMATION");
            alert.showAndWait();
        }

    }

}
