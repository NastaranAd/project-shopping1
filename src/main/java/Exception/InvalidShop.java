package Exception;

public class InvalidShop extends Exception
{
    String text;
    public InvalidShop(String text)
    {
        this.text=text;
    }

}
