package com.example.demoprojectphase22;

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
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Products implements Initializable {

    @FXML
    private Button backButton;

    @FXML
    private TableView<Product> view;

    @FXML
    private TableColumn<Product, String> name;

    private ObservableList<Product> list = FXCollections.observableArrayList(Admin1.getAdmin1().getProducts());

    @FXML
    private TableColumn<Product, Integer> phone;

    @FXML
    void backButton(MouseEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("main.fxml")));
        Stage stage = (Stage) ((Node) (event.getSource())).getScene().getWindow();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    name.setCellValueFactory(new PropertyValueFactory<Product , String>("productName"));
            //price.setCellValueFactory(new PropertyValueFactory<Product,Double>("productPrice"));
//            score.setCellValueFactory(new PropertyValueFactory<>("averageScore"));
//            capacity.setCellValueFactory(new PropertyValueFactory<>("capacity"));
//            comment.setCellValueFactory(new PropertyValueFactory<>("comment"));
//            score.setCellValueFactory(new PropertyValueFactory<>("averageScore"));
//            view.setItems(list);
        view.setItems(list);
    }
}