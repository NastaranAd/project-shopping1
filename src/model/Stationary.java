package model;

abstract public class Stationary extends Product {
    private String country;

   public Stationary(String productName,long productPrice,long productId,int capacity,category product,String country) {
        super(productName,productPrice,productId,capacity,product);
        this.country = country;
    }
    public String getCountry()
    {
        return this.country;
    }
}
