package model;

public class Request200
{
    private String userName;
    private long money;
    private int index;
    public Request200(String userName , long money )
    {
        this.userName=userName;
        this.money = money;
    }
    public String getUserName()
    {
        return this.userName;
    }
    public long getMoney()
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
