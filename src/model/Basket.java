package model;

import java.util.ArrayList;

public class Basket
{
   private  String productName100;
   private long money100;
   private int index;
   public Basket(String productName,long money100)
   {
       this.productName100= productName;
       this.money100=money100;
   }
   public Basket(int index)
   {
       this.index= index;
   }
   public int getIndex()
   {
       return this.index;
   }
   public String getProductName100()
   {
       return this.productName100;
   }
   public long getMoney100()
    {
        return this.money100;
    }
    final private ArrayList<Product> products= new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }
}
