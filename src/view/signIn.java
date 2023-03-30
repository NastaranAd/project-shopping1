package view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class signIn {
    Scanner cin = new Scanner(System.in);

    public void signIn1() {

        boolean helper = false;
        while (helper == false) {
            cin.nextLine();
            System.out.println("please enter your email : ");
            String email = cin.nextLine();
            Pattern pattern = Pattern.compile("^\\w+@(gmail|yahoo)\\.com$");
            Matcher matcher = pattern.matcher(email);
            boolean found = matcher.find();
            if (found == true) {
                helper=true;
            }
        }
        boolean helper1=false;
        while (helper1==false)
        {
            cin.nextLine();
            System.out.println("please enter your password : ");
            String password = cin.nextLine();
            Pattern pattern1 = Pattern.compile("^09\\d{9}$");
            Matcher matcher = pattern1.matcher(password);
            boolean found1 = matcher.find();
            if (found1 == true) {
                helper1=true;
            }
        }
        boolean helper2=false;
        while (helper2==false)
        {
            cin.nextLine();
            System.out.println("please enter your phone number : ");
            String phoneNumber = cin.nextLine();
            Pattern pattern2=Pattern.compile("^09\\d{9}$");
            Matcher matcher = pattern2.matcher(phoneNumber);
            boolean found2 = matcher.find();
            if (found2==true)
            {
                helper2=true;
            }
        }

    }
}
