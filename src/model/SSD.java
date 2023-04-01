package model;

public class SSD extends Digital
{
    private double readingSpeed;
    private double writingSpeed;
   public SSD(String productName,long productPrice,long productId,int capacity,category product,double weight, double dimension , String usbVersiondouble,double readingSpeed,double writingSpeed)
    {
        super(productName,productPrice,productId,capacity,product,weight,dimension);
        this.readingSpeed=readingSpeed;
        this.writingSpeed=writingSpeed;
    }
}