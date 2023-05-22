package Model;

public class Pen extends Stationary implements Code {
    private String color;

   public  Pen(String productName,double productPrice,double averageScore,int capacity,category product,String country, String color,String comment) {
        super(productName,productPrice, averageScore,capacity,product,country,comment);
        this.color = color;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "color : "+ color;
    }
    public String getColor()
    {
        return this.color;
    }

    @Override
    public void addDiscountCode() {

    }

    @Override
    public void removeDiscountCode() {

    }
}