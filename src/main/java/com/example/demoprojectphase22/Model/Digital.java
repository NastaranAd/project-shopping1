package com.example.demoprojectphase22.Model;

import com.example.demoprojectphase22.Model.Product;

abstract public class Digital extends Product implements Code
{
    private double weight;
    private double dimension;
    Digital(String productName,double productPrice,double averageScore,int capacity,category product,double weight, double dimension,String comment) {
        super(productName,productPrice, averageScore,capacity,product,comment);
        this.weight = weight;
        this.dimension = dimension;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "weight : "+weight+" , dimension : "+dimension;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public double getDimension()
    {
        return this.dimension;
    }
    private double percent;

    @Override
    public void addDiscountCode(String name ,double percent) {
        for (int k = 0; k<Admin1.getAdmin1().getProducts().size(); k++)
        {
            if(Admin1.getAdmin1().getProducts().get(k).getProductName().equals(name)){
                Admin1.getAdmin1().getProducts().get(k).setProductPrice(Admin1.getAdmin1().getProducts().get(k).getProductPrice()*(1-(percent/100)));
                this.percent=percent;
                break;
            }
        }
    }

    @Override
    public void removeDiscountCode(String name) {
        for(int j=0 ; j<Admin1.getAdmin1().getProducts().size();j++){
            if(Admin1.getAdmin1().getProducts().get(j).getProductName().equals(name)){
                Admin1.getAdmin1().getProducts().get(j).setProductPrice(Admin1.getAdmin1().getProducts().get(j).getProductPrice()*(100/percent));
                this.percent=0;
                break;
            }


        }
    }
}


