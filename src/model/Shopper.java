package model;

import java.util.ArrayList;

public class Shopper
{
    private String password;
    private String email;
    private String phoneNumber;
    private long  userAccountCredentials;
     private String userName;
    private ArrayList<Factor> factors=new ArrayList<>();

    public ArrayList<Factor>getFactors()
    {
        return factors;
    }
    public Shopper(String email,String password,String phoneNumber,String userName)
    {
        this.email=email;
        this.password=password;
        this.phoneNumber=phoneNumber;
        this.userName= userName;

    }
    public String toString()
    {
        return "userName : "+userName+ ", password : "+password+", phone number : "+phoneNumber+", email : "+email;
    }
    public String getPassword()
    {
        return  password;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public String getUserName()
    {
        return this.userName;
    }
}
