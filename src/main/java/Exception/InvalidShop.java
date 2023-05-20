package Exception;

public class InvalidShop extends Exception
{
    String text;
    InvalidShop(String text)
    {
        this.text=text;
    }

}
