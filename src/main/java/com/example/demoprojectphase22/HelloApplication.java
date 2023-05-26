package com.example.demoprojectphase22;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import Model.Admin1;
import View.signIn;
import View.logIn;
import View.Admin60;
import Controller.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;
import java.io.IOException;

import Exception.*;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, InvalidEmail, InvalidPassword, InvalidPhoneNumber {
        Scanner cin = new Scanner(System.in);
        Admin1.getAdmin1("admin", "admin");
        Admin add = new Admin();
        Shopper admin40 = new Shopper();
        add.add(Admin1.getAdmin1());
        Admin60 admin60 = new Admin60();
        signIn user = new signIn();
        logIn user1 = new logIn();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 274, 362);
        stage.setScene(scene);
        stage.show();


    }
    public static void main(String[] args) {
        launch();
    }
}