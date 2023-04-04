package model;

abstract public class Stationary extends Product {
    private String country;

   public Stationary(String productName,long productPrice,double averageScore,int capacity,category product,String country,String comment) {
        super(productName,productPrice, averageScore,capacity,product,comment);
        this.country = country;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "country : "+country;
    }
    public String getCountry()
    {
        return this.country;
    }
}
