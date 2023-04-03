package view;

import controller.Admin;
import model.*;
import controller.*;
import model.Shopper;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class signIn {
    String email;
    String password;
    String phoneNumber;
    String userName;
    Scanner cin = new Scanner(System.in);
    controller.Shopper admin3 = new controller.Shopper();

    public void signIn1() {
        boolean helper = false;
        while (helper == false) {
            cin.nextLine();
            System.out.println("please enter your email : ");
            email = cin.nextLine();
            Pattern pattern = Pattern.compile("^\\w+@(gmail|yahoo)\\.com$");
            Matcher matcher = pattern.matcher(email);
            boolean found = matcher.find();
            if (found == true) {
                helper = true;
            }
        }
        boolean helper1 = false;
        while (helper1 == false) {
            cin.nextLine();
            System.out.println("please enter your password : ");
            password = cin.nextLine();
            Pattern pattern1 = Pattern.compile("^09\\d{9}$");
            Matcher matcher = pattern1.matcher(password);
            boolean found1 = matcher.find();
            if (found1 == true) {
                helper1 = true;
            }
        }
        boolean helper2 = false;
        while (helper2 == false) {
            cin.nextLine();
            System.out.println("please enter your phone number : ");
            phoneNumber = cin.nextLine();
            Pattern pattern2 = Pattern.compile("^09\\d{9}$");
            Matcher matcher = pattern2.matcher(phoneNumber);
            boolean found2 = matcher.find();
            if (found2 == true) {
                helper2 = true;
            }
        }
        cin.nextLine();
        System.out.println("please enter your username : ");
        userName = cin.nextLine();
        cin.nextLine();
        System.out.println("IT WAS SUCCESSFUL");
        Request request = new Request(email, userName, phoneNumber, password);
        Request request1 = new Request(userName, 0);
        Admin1.getAdmin1().getSignInRequests().add(request);
        Admin1.getAdmin1().getSignInRequests().add(request1);

    }

    public void printCharacter() {
        System.out.println("1.sign in");
        System.out.println("2.log in");
        System.out.println("3.the list of products");
        System.out.println("4.EXIT");
        System.out.println("      ");
    }

    public void printChoice() {
        System.out.println("1.admin");
        System.out.println("2.shopper");
        System.out.println("3.EXIT");
    }

    public void printRequest() {
        if (Admin1.getAdmin1().getSignInRequests().size() != 0) {
            for (int i = 0; i < Admin1.getAdmin1().getSignInRequests().size() - 1; i++) {
                System.out.println(Admin1.getAdmin1().getSignInRequests().get(i).getUserName90() + " " + "this user wants to log in");
                cin.nextLine();
                System.out.println("do you want to accept the user ? ");
                String choice = cin.nextLine();
                if (Objects.equals(choice, "yes")) {
                    Shopper shopper = new Shopper(Admin1.getAdmin1().getSignInRequests().get(i).getEmail(), Admin1.getAdmin1().getSignInRequests().get(i).getPassword(), Admin1.getAdmin1().getSignInRequests().get(i).getPhoneNumber(), Admin1.getAdmin1().getSignInRequests().get(i).getUserName90(), 0);
                    Admin1.getAdmin1().getShoppers().add(shopper);
                    System.out.println("you add this user" + " " + Admin1.getAdmin1().getSignInRequests().get(i).getUserName90());
                }
                if (Objects.equals(choice, "no")) {
                    System.out.println("you did not add shopper");
                }
            }
        } else if (Admin1.getAdmin1().getSignInRequests().size() == 0) {
            System.out.println("you do not have any log in request");
        }

    }

    public void printRequestMoney(int index) {
        if (Admin1.getAdmin1().getRequestsmoney().size() != 0) {
            for (int i = 0; i < Admin1.getAdmin1().getRequestsmoney().size(); i++) {
                if (i == Admin1.getAdmin1().getRequestsmoney().size() - 1) {
                    System.out.println(Admin1.getAdmin1().getRequestsmoney().get(i).getUserName90() + "," + "this user wants to increase ");
                    cin.nextLine();
                    System.out.println("do you want to accept the request ? ");
                    String choice = cin.nextLine();
                    if (Objects.equals(choice, "yes")) {
                        System.out.println("new money : " + " " + Admin1.getAdmin1().getShoppers().get(index).setUserAccountCredentials(Admin1.getAdmin1().getRequestsmoney().get(i).getMoney()) + " " + "of this user : " + Admin1.getAdmin1().getRequestsmoney().get(i).getUserName90());
                    }
                    if (Objects.equals(choice, "no")) {
                        System.out.println("you did not accept the request");
                    }
                }
            }
        } else if (Admin1.getAdmin1().getRequestsmoney().size() == 0) {
            System.out.println("you do not have any money" +
                    " request");
        }

    }

    public void Shopping() {
        boolean helper = false;
        while (helper == false) {
            cin.nextLine();
            System.out.println("please enter your cart number : ");
            String cartNumber = cin.nextLine();
            Pattern pattern = Pattern.compile("^09\\d{9}$");
            Matcher matcher = pattern.matcher(cartNumber);
            boolean found = matcher.find();
            if (found == true) {
                helper = true;
            }
        }
        boolean helper1 = false;
        while (helper1 == false) {
            cin.nextLine();
            System.out.println("please enter your password : ");
            String password99 = cin.nextLine();
            Pattern pattern1 = Pattern.compile("^09\\d{9}$");
            Matcher matcher = pattern1.matcher(password99);
            boolean found1 = matcher.find();
            if (found1 == true) {
                helper1 = true;
            }
        }
        boolean helper2 = false;
        while (helper2 == false) {
            cin.nextLine();
            System.out.println("please enter your cvv2 : ");
            String cvv2 = cin.nextLine();
            Pattern pattern2 = Pattern.compile("^09\\d{9}$");
            Matcher matcher = pattern2.matcher(cvv2);
            boolean found2 = matcher.find();
            if (found2 == true) {
                helper2 = true;
            }
        }
        cin.nextLine();
        System.out.println("IT WAS SUCCESSFUL");


    }

    public void Shopping(String name1, int index) {
        for (int l = 0; l < Admin1.getAdmin1().getProducts().size(); l++) {
            if (Objects.equals(Admin1.getAdmin1().getProducts().get(l).getProductName(), name1)) {
                long sum = 0;
                for (int j = 0; j < Admin1.getAdmin1().getBaskets().size(); j++) {
                    sum = sum + Admin1.getAdmin1().getBaskets().get(j).getMoney100();
                }
                if (sum + Admin1.getAdmin1().getProducts().get(l).getProductPrice() <= Admin1.getAdmin1().getShoppers().get(index).getUserAccountCredentials()) {
                    Basket shop = new Basket(Admin1.getAdmin1().getProducts().get(l).getProductName(), sum + Admin1.getAdmin1().getProducts().get(l).getProductPrice());
                    Admin1.getAdmin1().getBaskets().add(shop);
                    System.out.println("new mojodi : " + Admin1.getAdmin1().getShoppers().get(index).setUserAccountCredentialsShopper(sum + Admin1.getAdmin1().getProducts().get(l).getProductPrice()));
                    Factor factor = new Factor("4/4", Admin1.getAdmin1().getProducts().get(l).getProductPrice(), Admin1.getAdmin1().getProducts().get(l).getProductName());
                    //Admin1.getAdmin1().getFactors().get(l).getProducts().add(Admin1.getAdmin1().getProducts().get(l));
                    Admin1.getAdmin1().getFactors().add(factor);
                    System.out.println("you take the thing that you want ");

                }
            }
        }

    }
    public void removeAdmin(String name)
    {
        admin3.Showing();
        System.out.println("which product do you want to remove?");
        cin.nextLine();
        System.out.println("please enter the product name?");

    }
}

