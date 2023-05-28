package com.example.demoprojectphase22.Model;


public class Pencil extends Stationary implements Code {
    private double percent;
    @Override
    public void addDiscountCode(String name , double percent ) {
        for (int k = 0; k<Admin1.getAdmin1().getProducts().size(); k++)
        {
            if(Admin1.getAdmin1().getProducts().get(k).getProductName().equals(name)){
                Admin1.getAdmin1().getProducts().get(k).setProductPrice(Admin1.getAdmin1().getProducts().get(k).getProductPrice()*(1-(percent/100)));
                this.percent=percent;
                break;
            }
        }


    }

    @Override
    public void removeDiscountCode(String name) {
        for(int j=0 ; j<Admin1.getAdmin1().getProducts().size();j++){
            if(Admin1.getAdmin1().getProducts().get(j).getProductName().equals(name)){
                Admin1.getAdmin1().getProducts().get(j).setProductPrice((Admin1.getAdmin1().getProducts().get(j).getProductPrice()*100)/percent);
                percent=0;
                break;
            }


        }
    }

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

