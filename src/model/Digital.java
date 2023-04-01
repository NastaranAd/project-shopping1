package model;

abstract public class Digital extends Product
{

    private double weight;
    private double dimension;
    Digital(String productName,long productPrice,long productId,int capacity,category product,double weight, double dimension) {
        super(productName,productPrice,productId,capacity,product);
        this.weight = weight;
        this.dimension = dimension;
    }

}


