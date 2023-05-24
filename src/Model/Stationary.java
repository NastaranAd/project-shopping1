package Model;

import java.util.ArrayList;

abstract public class Stationary extends Product {
    private String country;
    final private ArrayList<Pen> pens= new ArrayList<>();
    public ArrayList<Pen>getPens()
    {
        return pens;
    }

   public Stationary(String productName,double productPrice,double averageScore,int capacity,category product,String country,String comment) {
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
