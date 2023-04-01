package model;

public class Bikecycle  extends Vehicle {
    enum bikecycle {
        mountainous, road, urban, hybrid
    }

    bikecycle bike;

    public Bikecycle(String productName,long productPrice,long productId,int capacity,category product,String company, bikecycle bike) {
        super(productName,productPrice,productId,capacity,product,company);
        this.bike = bike;
    }
}
