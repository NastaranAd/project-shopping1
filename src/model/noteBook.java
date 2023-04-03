package model;

public class noteBook extends Stationary {
    private int pageNumber;
    private String paperType;

    public noteBook(String productName,long productPrice,double averageScore,int capacity,category product,String country, String paperType, int pageNumber) {
        super(productName,productPrice,averageScore,capacity,product,country);
        this.pageNumber = pageNumber;
        this.paperType = paperType;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "page Number : "+pageNumber+" , paper type : "+paperType;
    }

}