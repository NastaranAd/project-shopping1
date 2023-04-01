package model;

public class noteBook extends Stationary {
    private int pageNumber;
    private String paperType;

    public noteBook(String productName,long productPrice,long productId,int capacity,category product,String country, String paperType, int pageNumber) {
        super(productName,productPrice,productId,capacity,product,country);
        this.pageNumber = pageNumber;
        this.paperType = paperType;
    }

}