package model;

public class Food extends Product{
    private String dateOfManufacture;
    private String expirationDate;

    public Food(String productName,long productPrice,long productId,int capacity,category product,String dateOfManufacture, String expirationDate) {
        super(productName,productPrice,productId,capacity,product);
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
    }


}

