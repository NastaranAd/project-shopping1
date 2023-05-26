package Model;

import java.util.ArrayList;

public class Shopper {
    private String password;
    private String email;
    private String phoneNumber;
    private double userAccountCredentials;
    private final String userName;
    final private ArrayList<Factor> factors = new ArrayList<>();
    final private ArrayList<Basket> baskets= new ArrayList<>();
    final private ArrayList<Opinion> opinions= new ArrayList<>();
    final private ArrayList<Discount> discounts = new ArrayList<>();

    public ArrayList<Discount> getDiscounts() {
        return discounts;
    }

    public ArrayList<Opinion> getOpinions() {
        return opinions;
    }

    public ArrayList<Basket> getBaskets() {
        return baskets;
    }

    public ArrayList<Factor> getFactors() {
        return factors;
    }

    public Shopper(String email, String password, String phoneNumber, String userName, long userAccountCredentials) {
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.userAccountCredentials = userAccountCredentials;

    }

    public String toString() {
        return "userName : " + userName + ", password : " + password + ", phone number : " + phoneNumber + ", email : " + email;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getUserName() {
        return this.userName;
    }

    public double getUserAccountCredentials()
    {
        return  this.userAccountCredentials;
    }
    public double setUserAccountCredentials(double money)
    {
        return this.userAccountCredentials=this.userAccountCredentials+money;
    }
    public double setUserAccountCredentialsShopper(double money)
    {
        return  this.userAccountCredentials=this.userAccountCredentials-money;
    }

    public String setEmail(String email1) {
        return this.email = email1;
    }

    public String setPassword(String password1) {
        return this.password = password1;
    }

    public String setPhoneNumber(String phoneNumber1) {
        return this.phoneNumber = phoneNumber1;
    }
}

