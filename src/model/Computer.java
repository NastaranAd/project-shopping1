package model;

public class Computer extends Digital
{
    private String processorModel;
    private int RAM;

   public Computer(String productName, long productPrice, double averageScore, int capacity, Product.category product, double weight, double dimension , int RAM, String processorModel,String comment)
    {
        super(productName,productPrice, averageScore,capacity,product,weight,dimension,comment);
        this.RAM = RAM;
        this.processorModel = processorModel;
    }

    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "RAM : "+RAM+" , processor : "+processorModel;
    }
}
