package model;

public class Car extends Vehicle {
    private boolean auto;
    private double engineVolume;

    public Car(String productName, long productPrice, long productId, int capacity, Product.category product, String company, boolean auto, double engineVolume) {
        super(productName,productPrice,productId,capacity,product,company);
        this.auto = auto;
        this.engineVolume = engineVolume;
    }

}

