package Model;


public class Pencil extends Stationary {
   public enum pencil {
        HB, H, B, F, H2
    }

    public pencil pencil1;

    public Pencil(String productName,double productPrice,double averageScore,int capacity,category product,String country, pencil pencil1,String comment) {
        super(productName,productPrice,averageScore,capacity,product,country,comment);
        this.pencil1 = pencil1;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "pencil : "+pencil1;
    }
}

