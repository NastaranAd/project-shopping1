package com.example.demoprojectphase22;

public class Customer {
    static private Customer customer;
    static private  int index=0;

    public static int getIndex() {
        return Customer.index ;
    }
    public static int setIndex(int index1)
    {
        return Customer.index = index1;
    }
    public static void setCustomer(Customer customer)
    {
        Customer.customer = customer;
    }
    public static Customer getCustomer()
    {
        return customer;
    }
}
