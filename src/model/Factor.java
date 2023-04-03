package model;

import java.util.ArrayList;

public class Factor
{
    private String productName ;
    private long factorId;
    private String date;
    private double  amountPaid;
    private ArrayList<Product> products=new ArrayList<>();
    public ArrayList<Product>getProducts()
    {
        return products;
    }
    public Factor(String date,double amountPaid,String productName)
    {
        this.productName=productName;
        this.date=date;
        this.amountPaid=amountPaid;
    }
    public String getProductName()
    {
        return this.productName;
    }
    public String getDate()
    {
        return this.date;
    }
    public double getAmountPaid()
    {
        return this.amountPaid;
    }


}
