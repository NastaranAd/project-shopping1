package View;

import java.util.Scanner;

import Model.Product;
import Model.Admin1;
import Model.*;
import Controller.Shopper;

import java.util.Objects;

public class logIn {
    private int index;
    Scanner cin = new Scanner(System.in);
    Shopper admin3 = new Shopper();
    signIn helper5 = new signIn();


    public void logIn1() {
        cin.nextLine();
        System.out.println("please enter your user name : ");
        String userName = cin.nextLine();
        System.out.println("please enter your password : ");
        String password = cin.nextLine();
        boolean bool = false;
        for (int i = 0; i < Admin1.getAdmin1().getShoppers().size(); i++)
            if ( Objects.equals(Admin1.getAdmin1().getShoppers().get(i).getPassword(), password) && Objects.equals(Admin1.getAdmin1().getShoppers().get(i).getUserName(), userName)) {
                bool=true;
                System.out.println("        *****     WELCOME     *****");
                printMenu();
                System.out.println("please enter your choice : ");
                int choice1 = cin.nextInt();
                while (choice1 != 15) {
                    if (choice1 == 1) {
                        printAccount();
                        cin.nextLine();
                        System.out.println("please enter your choice : ");
                        int choice2 = cin.nextInt();
                        while (choice2 != 5) {
                            if (choice2 == 1) {
                                System.out.println("please enter you new email : ");
                                cin.nextLine();
                                String email1 = cin.nextLine();
                                System.out.println("your new email is :");
                                System.out.println(admin3.changingEmail(email1));
                            }
                            if (choice2 == 2) {
                                System.out.println("please enter you new password : ");
                                cin.nextLine();
                                String password1 = cin.nextLine();
                                System.out.println("your new password is :");
                                System.out.println(admin3.changingPassword(password1));
                            }
                            if (choice2 == 3) {
                                System.out.println("please enter you new phone number : ");
                                cin.nextLine();
                                String phoneNumber1 = cin.nextLine();
                                System.out.println("your new phone number is :");
                                System.out.println(admin3.changingPhoneNumber(phoneNumber1));
                            }
                            if (choice2 == 4) {
                                System.out.println(admin3.showInformation());
                            }
                            printAccount();
                            System.out.println("please enter your choice : ");
                            choice2 = cin.nextInt();
                        }


                    }
                    if (choice1 == 2) {
                        System.out.println(admin3.Showing());
                    }
                    if (choice1 == 3)
                    {
                        printShopperDuty();
                        cin.nextLine();
                        System.out.println("please enter your choice : ");
                        int choice80 = cin.nextInt();
                        while (choice80 != 3) {
                            if (choice80 == 1) {
                                System.out.println(admin3.Showing());
                                cin.nextLine();
                                System.out.println("please enter the product name : ");
                                String name = cin.nextLine();
                                helper5.Shopping(name,i);
                            }
                            if (choice80==2)
                            {
                                System.out.println(admin3.showBaskest(i));
                                cin.nextLine();
                                System.out.println("are you done with shopping ?");
                                String done = cin.nextLine();
                                if (Objects.equals(done, "yes")) {
                                    helper5.Shopping1(i);
                                }
                                if (Objects.equals(done,"no"))
                                {
                                    break;
                                }
                            }
                            cin.nextLine();
                            printShopperDuty();
                            cin.nextLine();
                            System.out.println("please enter your choice : ");
                            choice80 = cin.nextInt();
                        }
                    }
                    if (choice1 == 4) {
                        System.out.println("how much do you want to increase your Bank account balance?");
                        long money = cin.nextInt();
                        Request200 request70 = new Request200(Admin1.getAdmin1().getShoppers().get(i).getUserName(), money);
                        Admin1.getAdmin1().getRequest200().add(request70);
                        Request200 request200 = new Request200(i);
                        Admin1.getAdmin1().getRequest200().add(request200);
                        helper5.Shopper200();
                    }
                    if (choice1 == 5) {
                        System.out.println(admin3.showFactors(i));
                        System.out.println("    ");

                    }
                    if (choice1 == 6) {
                        System.out.println(admin3.Showing());
                        cin.nextLine();
                        System.out.println("please enter the category : ");
                        Product.category kind = Product.category.valueOf(cin.nextLine());
                        System.out.println(admin3.filterByCategory(kind));
                    }

                    if (choice1 == 7) {
                        System.out.println(admin3.Showing());
                        cin.nextLine();
                        System.out.println("please enter the period of your price : ");
                        cin.nextLine();
                        System.out.println("max : ");
                        long max = cin.nextLong();
                        cin.nextLine();
                        System.out.println("min : ");
                        long min = cin.nextLong();
                        System.out.println(admin3.filterByPrice(max, min));

                    }
                    if (choice1 == 8) {
                        System.out.println(admin3.Showing());
                        cin.nextLine();
                        System.out.println(admin3.filterByCapacity());
                    }
                    if (choice1 == 9) {
                        System.out.println(admin3.Showing());
                        cin.nextLine();
                        System.out.println("please enter the company name :");
                        String company = cin.nextLine();
                        System.out.println(admin3.filterByCompany(company));

                    }
                    if (choice1 == 10) {
                        System.out.println(admin3.Showing());
                        cin.nextLine();
                        System.out.println("please enter the country name :");
                        String country = cin.nextLine();
                        System.out.println(admin3.filterByCountry(country));
                    }
                    if (choice1==11)
                    {
                        System.out.println(admin3.Showing());
                        cin.nextLine();
                        System.out.println("please enter the country color:");
                        String color = cin.nextLine();
                        System.out.println(admin3.filterByColor(color));
                    }
                    if (choice1==12)
                    {
                        System.out.println(admin3.Showing());
                        cin.nextLine();
                        System.out.println("please enter the period of the weight:");
                        cin.nextLine();
                        System.out.println("max : ");
                        double max = cin.nextDouble();
                        cin.nextLine();
                        System.out.println("min : ");
                        double min = cin.nextDouble();
                        System.out.println(admin3.filterByWeight(max,min));
                    }
                    if (choice1==13)
                    {
                        System.out.println(admin3.Showing());
                        cin.nextLine();
                        System.out.println("please enter the  dimension:");
                        cin.nextLine();
                        System.out.println("max : ");
                        double max = cin.nextDouble();
                        cin.nextLine();
                        System.out.println("min : ");
                        double min = cin.nextDouble();
                        System.out.println(admin3.filterByDimension(max,min));
                    }
                    if (choice1 == 14) {
                        System.out.println(admin3.Showing());
                        cin.nextLine();
                        System.out.println("please enter the product name :");
                        String name1 = cin.nextLine();
                        System.out.println(admin3.searchByName(name1));

                    }
                    printMenu();
                    System.out.println("please enter your choice : ");
                    choice1 = cin.nextInt();

                }


            }
        if (bool==false)
        {
            System.out.println("we do not have this user");
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
        System.out.println("8.filter by capacity");
        System.out.println("9.filter by company");
        System.out.println("10.filter by country");
        System.out.println("11.filter by color");
        System.out.println("12.filter by weight");
        System.out.println("13.filter by dimension");
        System.out.println("14.search by name ");
        System.out.println("15.EXIT");
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

