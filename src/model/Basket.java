package model;

public class Basket
{
   private  String productName100;
   private long money100;
   public Basket(String productName,long money100)
   {
       this.productName100= productName;
       this.money100=money100;
   }
   public String getProductName100()
   {
       return this.productName100;
   }
   public long getMoney100()
    {
        return this.money100;
    }
}
