package view;

import controller.Admin;
import controller.Shopper;
import model.Admin1;

import java.util.Objects;
import java.util.Scanner;

public class Admin60 {
    Scanner cin = new Scanner(System.in);
    Admin admin = new Admin();
    Shopper admin3 = new Shopper();
    int choice6 = 0;

    public void adminDuty() {
        cin.nextLine();
        System.out.println("please enter your user name : ");
        String userName30 = cin.nextLine();
        System.out.println("please enter your password ");
        String password30 = cin.nextLine();
        if (Objects.equals(userName30, "admin") && Objects.equals(password30, "admin")) {
            printAdmin();
            System.out.println("please enter your choice : ");
            int choice5 = cin.nextInt();
            while (choice5 != 3) {
                if (choice5 == 1) {
                    while (choice6 != 1) {
                        printHelp();
                        choice6 = cin.nextInt();
                    }
                }
                if (choice5 == 2) {
                    System.out.println("please enter your order : ");
                    cin.nextLine();
                    String order = cin.nextLine();
                    admin.showSignRequest(order);
                    admin.showMoneyRequest(order);
                    admin.addingAdmin(order);

                    if (Objects.equals(order, "Remove")) {
                        System.out.println(admin3.Showing());
                        System.out.println("please enter the product name : ");
                        String name = cin.nextLine();
                        admin.removeAdmin(order, name);
                    }
                }
                cin.nextLine();
                printAdmin();
                choice5 = cin.nextInt();
            }

        }

    }


    public void printAdmin() {
        System.out.println("1.help");
        System.out.println("2.order");
        System.out.println("3.EXIT");

    }

    public void printHelp() {
        System.out.println("if you want to see sign in request enter -> sign in request");
        System.out.println("if you want to see the money request enter -> money request");
        System.out.println("if you want to add car -> Add car engine true|false company name price capacity");
        System.out.println("if you want to add computer -> Add computer name price weight dimension RAM model capacity");
        System.out.println("if you want to add information -> Add information name price weight dimension capacity");
        System.out.println("if you want to add SSD -> Add SSD name price weight dimension usbVersion readingSpeed writingSpeed capacity");
        System.out.println("if you want to add flash -> Add flash name price weight dimension usbVersion capacity");
        System.out.println("if you want to add pen -> Add pen name price country color capacity");
        System.out.println("if you want to add pencil -> Add pencil name price country pencilEnum capacity ");
        System.out.println("if you want to add notebook -> Add notebook name price country paperType pageNumber capacity");
        System.out.println("if you want to add food -> Add food name price productionDay expirationDate capacity");
        System.out.println("if you want to remove the product -> Remove");
        System.out.println("1.EXIT");
    }

}
