package Model;

public class SSD extends Digital
{
    private double readingSpeed;
    private double writingSpeed;
   public SSD(String productName,double productPrice,double averageScore,int capacity,category product,double weight, double dimension ,double readingSpeed,double writingSpeed,String comment)
    {
        super(productName,productPrice, averageScore,capacity,product,weight,dimension,comment);
        this.readingSpeed=readingSpeed;
        this.writingSpeed=writingSpeed;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "readingSpeed : "+readingSpeed +" , writingSpeed : "+writingSpeed;
    }

    @Override
    public void addDiscountCode() {

    }

    @Override
    public void removeDiscountCode() {

    }
}