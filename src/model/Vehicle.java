package model;

abstract public class Vehicle extends Product
{
    private String company;
    Vehicle(String productName,long productPrice,double averageScore,int capacity,category product,String company,String comment) {
        super(productName,productPrice, averageScore,capacity,product,comment);
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

