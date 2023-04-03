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
    public Product(String productName,long productPrice,double averageScore ,int capacity,category product)
    {
       this.productPrice=productPrice;
       this.averageScore=averageScore;
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
    public String  setProductName(String name)
    {
        return this.productName=name;
    }
    public int  setProductCapacity(int capacity)
    {
        return this.capacity=capacity;
    }
    public long  setProductprice(long price)
    {
        return this.productPrice=price;
    }
    public int  setProductCapacitymines()
    {
        return this.capacity= this.capacity-1;
    }
    public double  setProductScore(double sum)
    {
        return this.averageScore=averageScore+sum;
    }

   @Override
    public String toString()
    {
        return "product name : "+ productName+", product price : "+productPrice+", product category : "+product+", product capacity : "+capacity+",product average score : "+averageScore;
    }
    }



