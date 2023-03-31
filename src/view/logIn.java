package view;

import java.util.Scanner;

import model.Product;
import model.Admin1;
import model.*;
import controller.Admin;

import java.util.Objects;

public class logIn {

    Product pro = new Product("hoho",9,2,2, Product.category.DIGITAL);
    // System.out.println(Admin1.getAdmin1().getProducts().get(1).toString());
    String category;
    Scanner cin = new Scanner(System.in);
    Admin admin3 = new Admin();

    public void logIn() {
        cin.nextLine();
        System.out.println("please enter your email");
        String email = cin.nextLine();
        System.out.println("please enter your password");
        String password = cin.nextLine();
        System.out.println("please enter your phone number");
        String phoneNumber = cin.nextLine();
        for (int i = 0; i < Admin1.getAdmin1().getShoppers().size(); i++)
            if (Objects.equals(Admin1.getAdmin1().getShoppers().get(i).getEmail(), email) && Objects.equals(Admin1.getAdmin1().getShoppers().get(i).getPassword(), password) && Objects.equals(Admin1.getAdmin1().getShoppers().get(i).getPhoneNumber(), phoneNumber)) {
                System.out.println("        *****     WELCOME     *****");
                printMenu();
                System.out.println("please enter your choice : ");
                int choice1 = cin.nextInt();
                while (choice1 != 8) {
                    if (choice1 == 2) {
                     System.out.println(admin3.Showing());
                    }
                    if (choice1==3);
                    {
                        System.out.println(admin3.Showing());
                        cin.nextLine();
                        System.out.println("please enter the category : ");
                        Product.category kind  = Product.category.valueOf(cin.nextLine());
                        System.out.println(admin3.filterByCategory(kind));
                    }
                    if (choice1==4)
                    {

                    }
                    if (choice1==5)
                    {

                    }
                    if (choice1==6)
                    {

                    }
                    if (choice1==7)
                    {

                    }
                    printMenu();
                    System.out.println("please enter your choice : ");
                     choice1 = cin.nextInt();

                }


            }


    }

    public void printMenu() {
        System.out.println("1.the information of your account");
        System.out.println("2.View the goods");
        System.out.println("3.shopping");
        System.out.println("4.increase account credit");
        System.out.println("5.Invoice display");
        System.out.println("6.filter by category");
        System.out.println("7.filter by price");
        System.out.println("8.EXIT");
    }

}

