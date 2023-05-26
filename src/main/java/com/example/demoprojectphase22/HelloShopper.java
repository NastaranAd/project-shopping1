package com.example.demoprojectphase22;

import Model.Admin1;
import View.logIn;
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

public class HelloShopper {
    logIn user1 = new logIn();
    @FXML
    private TextField username;

    @FXML
    private TextField password;

    @FXML
    private Button submit;

    @FXML
    private Button back;

    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("helloLogIn.fxml")));
        Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void submit(MouseEvent event) throws IOException {
        String userName1 = username.getText();
        String password1 = password.getText();
        boolean bool = false;
        for (int i = 0; i < Admin1.getAdmin1().getShoppers().size(); i++)
            if ( Objects.equals(Admin1.getAdmin1().getShoppers().get(i).getPassword(), password1) && Objects.equals(Admin1.getAdmin1().getShoppers().get(i).getUserName(), userName1)) {

                Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("shopperMenu.fxml")));
                Stage stage = (Stage) ((Node)(event.getSource())).getScene().getWindow();
                Scene scene = new Scene(parent);
                stage.setScene(scene);
                stage.show();
                bool= true;

            }
        if (bool==false)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("WRONG!");
            alert.setContentText("we don't have this user");
            alert.showAndWait();

        }
    }
}
