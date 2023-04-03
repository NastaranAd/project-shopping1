package model;

public class Bikecycle  extends Vehicle {
    public enum bikecycle {
        mountainous, road, urban, hybrid
    }

    public bikecycle bike;

    public Bikecycle(String productName,long productPrice,long productId,int capacity,category product,String company, bikecycle bike) {
        super(productName,productPrice,productId,capacity,product,company);
        this.bike = bike;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "bike : "+bike;
    }
}
