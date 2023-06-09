package Model;

abstract public class Digital extends Product
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

}


