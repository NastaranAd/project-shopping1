package view;

import controller.Admin;
import model.Admin1;

import java.util.Objects;
import java.util.Scanner;

public class Admin60 {
    Scanner cin = new Scanner(System.in);
    Admin admin = new Admin();
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
        System.out.println("if you want to add product -> Add Car 4300 true BMW X5 66000 3");
        System.out.println("1.EXIT");
    }

}
