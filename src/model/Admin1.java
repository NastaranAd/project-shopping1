package model;

import java.util.ArrayList;

public class Admin1
{
    private static Admin1 admin1;
    private ArrayList<Product> products =new ArrayList<>();
    public ArrayList<Product>getProducts()
    {
        return products;
    }
    private String password;
    private String userName;

    public Admin1(String password, String userName) {
        this.password = password;
        this.userName = userName;
    }
    public static Admin1 getAdmin1(String userName,String password)
    {
        if(admin1==null)
        {
            admin1= new Admin1(userName,password);
        }
        return admin1;
    }
    public static Admin1 getAdmin1()
    {
        return admin1;
    }
}
