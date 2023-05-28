package com.example.demoprojectphase22.Model;

public class Pen extends Stationary implements Code {
    private String color;
    private double percent ;
    private String nameProduct;// for find product to set discount !!!


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
    public void addDiscountCode(String name , double percent) {
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

}