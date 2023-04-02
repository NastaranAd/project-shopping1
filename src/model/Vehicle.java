package model;

abstract public class Vehicle extends Product
{
    private String company;
    Vehicle(String productName,long productPrice,long productId,int capacity,category product,String company) {
        super(productName,productPrice,productId,capacity,product);
        this.company = company;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "company : "+company;
    }
    public String getCompany()
    {
        return this.company;
}
}
