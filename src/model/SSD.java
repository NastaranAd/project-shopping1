package model;

public class SSD extends Digital
{
    private double readingSpeed;
    private double writingSpeed;
   public SSD(String productName,long productPrice,double averageScore,int capacity,category product,double weight, double dimension , String usbVersiondouble,double readingSpeed,double writingSpeed)
    {
        super(productName,productPrice, averageScore,capacity,product,weight,dimension);
        this.readingSpeed=readingSpeed;
        this.writingSpeed=writingSpeed;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "readingSpeed : "+readingSpeed +" , writingSpeed : "+writingSpeed;
    }
}