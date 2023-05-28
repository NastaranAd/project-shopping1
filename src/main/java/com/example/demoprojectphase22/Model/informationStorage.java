package com.example.demoprojectphase22.Model;

public class informationStorage extends Digital {
    private int capacity1;
    private double percent;

    public informationStorage(String productName,double productPrice,double averageScore,int capacity,category product,double weight, double dimension,String comment) {
        super(productName,productPrice, averageScore,capacity,product,weight,dimension,comment);
        this.capacity1 = capacity;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "capacity : "+capacity1;
    }
    }