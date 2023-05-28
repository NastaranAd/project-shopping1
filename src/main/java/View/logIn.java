package View;

import Controller.Shopper;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.Scanner;

public class logIn {

    Scanner cin = new Scanner(System.in);
    Shopper admin3 = new Shopper();
    signIn helper5 = new signIn();


    public void logIn1(String userName, String password, MouseEvent event) throws IOException {



    }

    public void printMenu() {
        System.out.println("1.the information of your account");
        System.out.println("2.View the goods");
        System.out.println("3.shopping");
        System.out.println("4.increase account credit");
        System.out.println("5.Invoice display");
        System.out.println("6.View the discount code");
        System.out.println("7.filter by category");
        System.out.println("8.filter by price");
        System.out.println("9.filter by capacity");
        System.out.println("10.filter by company");
        System.out.println("11.filter by country");
        System.out.println("12.filter by color");
        System.out.println("13.filter by weight");
        System.out.println("14.filter by dimension");
        System.out.println("15.search by name ");
        System.out.println("16.EXIT");
    }

    public void printAccount() {
        System.out.println("1.email");
        System.out.println("2.password");
        System.out.println("3.phone number");
        System.out.println("4.show the information");
        System.out.println("5.Exit");
    }

    public void printShopperDuty() {
        System.out.println("1.shopping");
        System.out.println("2.basket");
        System.out.println("3.Exit");
    }

}

