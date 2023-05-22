package Exception;

public class InvalidEntrance extends Exception{
    String text;
    public InvalidEntrance(String text)
    {
        this.text=text;
    }
}
