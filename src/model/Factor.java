package model;

import java.util.ArrayList;

public class Factor
{
    private long factorId;
    private String date;
    private double  amountPaid;
    private ArrayList<Product> products=new ArrayList<>();
    public ArrayList<Product>getProducts()
    {
        return products;
    }

}
