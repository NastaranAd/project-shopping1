package model;

public class informationStorage extends Digital {
    private int capacity1;

    informationStorage(String productName,long productPrice,long productId,int capacity,category product,double weight, double dimension) {
        super(productName,productPrice,productId,capacity,product,weight,dimension);
        this.capacity1 = capacity;

    }

}