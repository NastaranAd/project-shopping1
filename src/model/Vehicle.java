package model;

public class Vehicle extends Product
{
    private String company;

    Vehicle(String productName,long productPrice,long productId,int capacity,category product,String company) {
        super(productName,productPrice,productId,capacity,product);
        this.company = company;
    }
}

