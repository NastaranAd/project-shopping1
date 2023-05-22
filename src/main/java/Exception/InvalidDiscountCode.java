package Exception;

public class InvalidDiscountCode extends Exception {
    String text ;
    public InvalidDiscountCode (String text)
    {
        this.text=text;
    }
}
