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

class Computer extends Digital {
    private String processorModel;
    private int RAM;

    Computer(String productName,long productPrice,long productId,int capacity,category product,double weight, double dimension , int RAM, String processorModel) {
        super(productName,productPrice,productId,capacity,product,weight,dimension);
        this.RAM = RAM;
        this.processorModel = processorModel;
    }
}

class Stationary extends Product {
    private String country;

    Stationary(String productName,long productPrice,long productId,int capacity,category product,String country) {
        super(productName,productPrice,productId,capacity,product);
        this.country = country;
    }
}

class Pencil extends Stationary {
    enum pencil {
        HB, H, B, F, H2
    }

    pencil pencil1;

    Pencil(String productName,long productPrice,long productId,int capacity,category product,String country, pencil pencil1) {
        super(productName,productPrice,productId,capacity,product,country);
        this.pencil1 = pencil1;
    }
}

class Pen extends Stationary {
    private String color;

    Pen(String productName,long productPrice,long productId,int capacity,category product,String country, String color) {
        super(productName,productPrice,productId,capacity,product,country);
        this.color = color;
    }
}

class noteBook extends Stationary {
    private int pageNumber;
    private String paperType;

    noteBook(String productName,long productPrice,long productId,int capacity,category product,String country, String paperType, int pageNumber) {
        super(productName,productPrice,productId,capacity,product,country);
        this.pageNumber = pageNumber;
        this.paperType = paperType;
    }

}

class Vehicles extends Product {
    private String company;

    Vehicles(String productName,long productPrice,long productId,int capacity,category product,String company) {
        super(productName,productPrice,productId,capacity,product);
        this.company = company;
    }
}

class Bikecycle extends Vehicles {
    enum bikecycle {
        mountainous, road, urban, hybrid
    }

    bikecycle bike;

    Bikecycle(String productName,long productPrice,long productId,int capacity,category product,String company, bikecycle bike) {
        super(productName,productPrice,productId,capacity,product,company);
        this.bike = bike;
    }

}

class Car extends Vehicles {
    private boolean auto;
    private double engineVolume;

    Car(String productName,long productPrice,long productId,int capacity,category product,String company, boolean auto, double engineVolume) {
        super(productName,productPrice,productId,capacity,product,company);
        this.auto = auto;
        this.engineVolume = engineVolume;
    }

}

class Food extends Product{
    private String dateOfManufacture;
    private String expirationDate;

    Food(String productName,long productPrice,long productId,int capacity,category product,String dateOfManufacture, String expirationDate) {
        super(productName,productPrice,productId,capacity,product);
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
    }


}
