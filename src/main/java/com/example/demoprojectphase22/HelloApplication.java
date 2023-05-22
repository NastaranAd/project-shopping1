package com.example.demoprojectphase22;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Model.Admin1;
import View.signIn;
import View.logIn;
import View.Admin60;
import Controller.*;

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
        System.out.println("       *****     WELCOME     *****");
        cin.nextLine();
        user.printCharacter();
        System.out.println("please enter your choice : ");
        int choice8 = cin.nextInt();
        while (choice8 != 4) {
            if (choice8 == 1) {
                boolean w = true;
                while (w) {
                    try {
                        user.signIn1();
                        w = false;
                    } catch (InvalidEmail | InvalidPassword e) {
                        System.out.println(e.getMessage());
                    }
                }
            }

        if (choice8 == 2) {
            user.printChoice();
            cin.nextLine();
            System.out.println("please enter your choice : ");
            int choice9 = cin.nextInt();
            while (choice9 != 3) {
                if (choice9 == 1) {
                    admin60.adminDuty();
                }
                if (choice9 == 2) {
                    user1.logIn1();
                }
                user.printChoice();
                cin.nextLine();
                System.out.println("please enter your choice : ");
                choice9 = cin.nextInt();
            }

        }
        if (choice8 == 3) {
            System.out.println(admin40.Showing());
        }
        user.printCharacter();
        System.out.println("please enter your choice : ");
        choice8 = cin.nextInt();
    }
    }
    public static void main(String[] args) {
        launch();
    }
}