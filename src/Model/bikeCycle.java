package Model;

public class bikeCycle extends Vehicle {
    public enum bikeCycle1 {
        MOUNTAINOUS, ROAD,URBAN,HYBRID
    }

    public bikeCycle1 bike;

    public bikeCycle(String productName, double productPrice, double averageScore, int capacity, category product, String company, bikeCycle1 bike,String comment) {
        super(productName,productPrice, averageScore,capacity,product,company,comment);
        this.bike = bike;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "bike : "+bike;
    }
}
