package Model;

public class Request200
{
    private String userName;
    private double money;
    private int index;
    public Request200(String userName , double money )
    {
        this.userName=userName;
        this.money = money;
    }
    public String getUserName()
    {
        return this.userName;
    }
    public double getMoney()
    {
        return this.money;
    }

    public int getIndex() {
        return index;
    }

    public Request200(int index)
    {
        this.index=index;
    }
}
