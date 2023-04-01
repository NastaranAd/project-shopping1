package view;

import controller.Admin;
import model.Request;
import model.Shopper;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Admin1;

public class signIn {

    int counter = 0;
    String email;
    String password;
    String phoneNumber;
    String userName;
    Scanner cin = new Scanner(System.in);

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
        Request request = new Request(userName,0);
        Admin1.getAdmin1().getSignInRequests().add(request);

    }

    public void printCharacter() {
        System.out.println("1.sign in");
        System.out.println("2.log in");
        System.out.println("3.the list of products");
        System.out.println("      ");
        System.out.println("please enter your choice : ");

    }

    public void printRequest() {
        if (Admin1.getAdmin1().getSignInRequests().size() != 0) {
            for (int i = 0; i < Admin1.getAdmin1().getSignInRequests().size(); i++) {
                System.out.println(  Admin1.getAdmin1().getSignInRequests().get(i).getUserName90() + " " + "this user wants to log in");
                cin.nextLine();
                System.out.println("do you want to accept the user ? ");
                String choice = cin.nextLine();
                if (Objects.equals(choice, "yes")) {
                    Shopper shopper = new Shopper(email, password, phoneNumber, userName, 0);
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
    public void printRequestMoney() {
        if (Admin1.getAdmin1().getRequestsmoney().size() != 0) {
            for (int i = 0; i < Admin1.getAdmin1().getRequestsmoney().size(); i++) {
                System.out.println(  Admin1.getAdmin1().getRequestsmoney().get(i).getUserName90() + "," + "this user wants to increase ");
                cin.nextLine();
                System.out.println("do you want to accept the request ? ");
                String choice = cin.nextLine();
                if (Objects.equals(choice, "yes")) {
                    Admin1.getAdmin1().getShoppers().get(i).setUserAccountCredentials(Admin1.getAdmin1().getRequestsmoney().get(i).getMoney());
                    System.out.println("new money : "+" "+Admin1.getAdmin1().getShoppers().get(i).getUserAccountCredentials());
                }
                if (Objects.equals(choice, "no")) {
                    Admin1.getAdmin1().getShoppers().get(i).setUserAccountCredentials1(Admin1.getAdmin1().getShoppers().get(i).getUserAccountCredentials());
                }
            }
        } else if (Admin1.getAdmin1().getRequestsmoney().size() == 0) {
            System.out.println("you do not have any money" +
                    " request");
        }

    }


}
