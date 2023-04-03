package model;

public class Flash extends Digital {
    private String usbVersion;

    public Flash(String productName,long productPrice,double averageScore,int capacity,category product,double weight, double dimension , String usbVersion) {
        super(productName,productPrice, averageScore,capacity,product,weight,dimension);
        this.usbVersion=usbVersion;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "usb version : "+usbVersion;
    }

}