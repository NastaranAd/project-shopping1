package model;

public class Computer extends Digital
{
    private String processorModel;
    private int RAM;

   public Computer(String productName, long productPrice, long productId, int capacity, Product.category product, double weight, double dimension , int RAM, String processorModel) {
        super(productName,productPrice,productId,capacity,product,weight,dimension);
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
