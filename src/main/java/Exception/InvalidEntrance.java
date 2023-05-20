package Exception;

public class InvalidEntrance extends Exception{
    String text;
    InvalidEntrance(String text)
    {
        this.text=text;
    }
}
