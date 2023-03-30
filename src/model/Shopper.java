package model;

import java.util.ArrayList;

public class Shopper
{
    private String password;
    private String email;
    private String phoneNumber;
    private long  userAccountCredentials;
    private ArrayList<Factor> factors=new ArrayList<>();
    private ArrayList<Shopper> shoppers;
    public ArrayList<Shopper> getShoppers()
    {
        return shoppers;
    }
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
    public String setPassword(String password)
    {
        return password;
    }
}
