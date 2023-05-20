package Exception;

public class InvalidEmail extends InvalidEntrance {
    public InvalidEmail(String text)
    {
        super(text);
    }
    public InvalidEmail (){
        super("Wrong");
    }
}
