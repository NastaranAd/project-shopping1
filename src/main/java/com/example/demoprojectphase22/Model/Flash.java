package com.example.demoprojectphase22.Model;

public class Flash extends Digital {
    private String usbVersion;
    private double percent;

    public Flash(String productName,double productPrice,double averageScore,int capacity,category product,double weight, double dimension , String usbVersion,String comment) {
        super(productName,productPrice, averageScore,capacity,product,weight,dimension,comment);
        this.usbVersion=usbVersion;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "usb version : "+usbVersion;
    }

}