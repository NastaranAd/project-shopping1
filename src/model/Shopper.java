package model;

import java.util.ArrayList;

public class Shopper {
    private String password;
    private String email;
    private String phoneNumber;
    private long userAccountCredentials;
    long Accountmoney;
    private final String userName;
    private ArrayList<Factor> factors = new ArrayList<>();

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

    public long getUserAccountCredentials()
    {
        return  this.userAccountCredentials;
    }
    public long setUserAccountCredentials(long money)
    {
        return this.userAccountCredentials=this.userAccountCredentials+money;
    }
    public long setUserAccountCredentialsShopper(long money)
    {
        return  this.userAccountCredentials=this.userAccountCredentials-money;
    }
    public long setUserAccountCredentials1(long money){return  this.userAccountCredentials=money;
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

