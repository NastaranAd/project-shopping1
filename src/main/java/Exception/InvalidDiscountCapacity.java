package Exception;

public class InvalidDiscountCapacity extends Exception{
    String text ;
   public InvalidDiscountCapacity(String text)
   {
       this.text = text ;
   }
}
