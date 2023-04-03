package model;


public class Pencil extends Stationary {
    enum pencil {
        HB, H, B, F, H2
    }

    pencil pencil1;

    public Pencil(String productName,long productPrice,long productId,int capacity,category product,String country, pencil pencil1) {
        super(productName,productPrice,productId,capacity,product,country);
        this.pencil1 = pencil1;
    }
    @Override
    public String toString()
    {
        return super.toString()+"\n"+
                "pencil : "+pencil1;
    }
}

