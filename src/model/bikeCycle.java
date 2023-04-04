package model;

public class bikeCycle extends Vehicle {
    public enum bikeCycle1 {
        MOUNTAINOUS, ROAD,URBAN,HYBRID
    }

    public bikeCycle1 bike;

    public bikeCycle(String productName, long productPrice, double averageScore, int capacity, category product, String company, bikeCycle1 bike) {
        super(productName,productPrice, averageScore,capacity,product,company);
        this.bike = bike;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "bike : "+bike;
    }
}
