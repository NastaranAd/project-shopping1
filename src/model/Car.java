package model;

public class Car extends Vehicle {
    private boolean auto;
    private double engineVolume;

    public Car(String productName, long productPrice, double averageScore, int capacity, Product.category product, String company, boolean auto, double engineVolume) {
        super(productName,productPrice, averageScore,capacity,product,company);
        this.auto = auto;
        this.engineVolume = engineVolume;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "auto : "+ auto+" , engine volume : "+engineVolume;
    }

}

