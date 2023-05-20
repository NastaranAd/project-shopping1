package Model;

public class Car extends Vehicle {
    private boolean auto;
    private double engineVolume;

    public Car(String productName, double productPrice, double averageScore, int capacity, category product, String company, boolean auto, double engineVolume,String comment) {
        super(productName,productPrice, averageScore,capacity,product,company,comment);
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

