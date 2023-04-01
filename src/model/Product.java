package model;
import java.util.ArrayList;

abstract class Account
{
  private String email;
  private String password;
  private String phoneNumber;

  Account(String email,String password,String phoneNumber)
  {
      this.email=email;
      this.password=password;
      this.phoneNumber=phoneNumber;
  }
  String getEmail()
  {
      return email;
  }
  String getPhoneNumber()
  {
      return phoneNumber;
  }
  String getPassword()
  {
      return password;
  }
}
public class Product {
    private long productId;
    private int capacity;
    private long productPrice;
    private String productName;
    private double averageScore;
    private ArrayList<Opinion>opinions=new ArrayList<>();
    public category product;
    public ArrayList<Opinion>getOpinions()
    {
        return opinions;
    }
    public Product(String productName,long productPrice,long productId,int capacity,category product)
    {
       this.productPrice=productPrice;
       this.productId=productId;
       this.capacity=capacity;
       this.productName=productName;
       this.product=product;
    }
    public String  getProductName()
    {
        return this.productName;
    }
    public long getProductPrice()
    {
        return this.productPrice;
    }
    public category getCategory()
    {
        return this.product;
    }
    public int getCapacity()
    {
        return this.capacity;
    }

    public enum category {
        DIGITAL, STATIONARY, VEHICLES, FOOD
    }
   @Override
    public String toString()
    {
        return "productPrice: "+ productPrice;
    }
    }

class informationStorage extends Digital {
    private int capacity1;

    informationStorage(String productName,long productPrice,long productId,int capacity,category product,double weight, double dimension) {
        super(productName,productPrice,productId,capacity,product,weight,dimension);
        this.capacity1 = capacity;

    }

}
class Flash extends Digital {
    private String usbVersion;

    Flash(String productName,long productPrice,long productId,int capacity,category product,double weight, double dimension , String usbVersion) {
        super(productName,productPrice,productId,capacity,product,weight,dimension);
        this.usbVersion=usbVersion;
    }
}
class SSD extends Digital
{
    private double readingSpeed;
    private double writingSpeed;
    SSD(String productName,long productPrice,long productId,int capacity,category product,double weight, double dimension , String usbVersiondouble,double readingSpeed,double writingSpeed)
    {
        super(productName,productPrice,productId,capacity,product,weight,dimension);
        this.readingSpeed=readingSpeed;
        this.writingSpeed=writingSpeed;
    }
}