package model;

public class Pen extends Stationary {
    private String color;

   public  Pen(String productName,long productPrice,double averageScore,int capacity,category product,String country, String color) {
        super(productName,productPrice, averageScore,capacity,product,country);
        this.color = color;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "color : "+ color;
    }
}