package com.example.demoprojectphase22.Model;

import com.example.demoprojectphase22.Model.Product;

public class Food extends Product {
    private String dateOfManufacture;
    private String expirationDate;

    public Food(String productName,double productPrice,double averageScore,int capacity,category product,String dateOfManufacture, String expirationDate,String comment) {
        super(productName,productPrice, averageScore,capacity,product,comment);
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
    }
    @Override
     public String toString()
    {
        return super.toString()+"\n"+
                "date of manu facture : "+dateOfManufacture+" , expiration date : "+expirationDate;
    }


}

