package view;
import model.Shopper;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class signIn {


    String email;
    String password;
    String phoneNumber;
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
        System.out.println("IT WAS SUCCESSFUL");
    }
        public void signIn2 ()
        {
            System.out.println("log in request");
        }
        public void printCharacter ()
        {
            System.out.println("1.sign in");
            System.out.println("2.log in");
            System.out.println("3.the list of products");
            System.out.println("      ");
            System.out.println("please enter your choice : ");

        }
        public void printMenu ()
        {
            System.out.println("1.the information of your account");
            System.out.println("2.View the goods");
            System.out.println("3.shopping");
            System.out.println("4.increase account credit");
            System.out.println("5.Invoice display");


        }
        public void printRequest ()
        {
            signIn2();
            cin.nextLine();
            System.out.println("do you want to accept the user ? ");
            String choice = cin.nextLine();
            if (Objects.equals(choice, "yes")) ;
            {
                Shopper shopper = new Shopper(email,password,phoneNumber);
                shopper.getShoppers().add(shopper);
                System.out.println("you add this user"+" "+email);
            }
            if (Objects.equals(choice,"no"));
            {
                System.out.println("you did not add shopper");
            }

        }

    }
