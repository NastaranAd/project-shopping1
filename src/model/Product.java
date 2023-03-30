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
    Product product1=new Product("BMW",100000,1,3,category.VEHICLES);
    private long productId;
    private int capacity;
    private long productPrice;
    private String productName;
    private double averageScore;
    private ArrayList<Opinion>opinions=new ArrayList<>();
    category product;
    public ArrayList<Opinion>getOpinions()
    {
        return opinions;
    }
    Product(String productName,long productPrice,long productId,int capacity,category product)
    {
       this.productPrice=productPrice;
       this.productId=productId;
       this.capacity=capacity;
       this.productName=productName;
       this.product=product;
    }
    
}
enum category {
    DIGITAL, STATIONARY, VEHICLES, FOOD
}

class Digital {
    private double weight;
    private double dimension;

    Digital(double weight, double dimension) {
        this.weight = weight;
        this.dimension = dimension;
    }

}

class informationStorage extends Digital {
    private int capacity;

    informationStorage(double dimension, double weight, int capacity) {
        super(weight, dimension);

        this.capacity = capacity;

    }

}

class Flash extends Digital {
    private String usbVersion;

    Flash(double dimension, double weight, String usbVersion) {
        super(weight, dimension);
        this.usbVersion=usbVersion;
    }
}
class SSD extends Digital
{
    private double readingSpeed;
    private double writingSpeed;
    SSD(double dimension, double weight,double readingSpeed,double writingSpeed)
    {
        super(weight, dimension);
        this.readingSpeed=readingSpeed;
        this.writingSpeed=writingSpeed;
    }
}

class Computer extends Digital {
    private String processorModel;
    private int RAM;

    Computer(double dimension, double weight, int RAM, String processorModel) {
        super(weight, dimension);
        this.RAM = RAM;
        this.processorModel = processorModel;
    }
}

class Stationary {
    private String country;

    Stationary(String country) {
        this.country = country;
    }
}

class Pencil extends Stationary {
    enum pencil {
        HB, H, B, F, H2
    }

    pencil pencil1;

    Pencil(String country, pencil pencil1) {
        super(country);
        this.pencil1 = pencil1;
    }
}

class Pen extends Stationary {
    private String color;

    Pen(String country, String color) {
        super(country);
        this.color = color;
    }
}

class noteBook extends Stationary {
    private int pageNumber;
    private String paperType;

    noteBook(String country, String paperType, int pageNumber) {
        super(country);
        this.pageNumber = pageNumber;
        this.paperType = paperType;
    }

}

class Vehicles {
    private String company;

    Vehicles(String company) {
        this.company = company;
    }
}

class Bikecycle extends Vehicles {
    enum bikecycle {
        mountainous, road, urban, hybrid
    }

    bikecycle bike;

    Bikecycle(String company, bikecycle bike) {
        super(company);
        this.bike = bike;
    }

}

class Car extends Vehicles {
    private boolean auto;
    private double engineVolume;

    Car(String company, boolean auto, double engineVolume) {
        super(company);
        this.auto = auto;
        this.engineVolume = engineVolume;
    }

}

class Food {
    private String dateOfManufacture;
    private String expirationDate;

    Food(String dateOfManufacture, String expirationDate) {
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
    }


}
class Admin1 {
    String password;
    String userName;

    Admin1(String password, String userName) {
        this.password = password;
        this.userName = userName;
    }
}