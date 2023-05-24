package Model;

public class noteBook extends Stationary {
    private int pageNumber;
    private String paperType;

    public noteBook(String productName,double productPrice,double averageScore,int capacity,category product,String country, String paperType, int pageNumber,String comment) {
        super(productName,productPrice,averageScore,capacity,product,country,comment);
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