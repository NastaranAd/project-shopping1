package model;

import java.util.ArrayList;

public class Shopper
{
    private String password;
    private String email;
    private String phoneNumber;
    private long  userAccountCredentials;
    private ArrayList<Factor> factors=new ArrayList<>();

    public ArrayList<Factor>getFactors()
    {
        return factors;
    }
    public Shopper(String email,String password,String phoneNumber)
    {
        this.email=email;
        this.password=password;
        this.phoneNumber=phoneNumber;
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
}
