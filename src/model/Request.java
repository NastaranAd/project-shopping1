package model;

public class Request
{
int t;
private String userName90;
private long money;
public Request(String userName,long money)
{
    this.userName90=userName;
    this.money=money;

}
public String getUserName90()
    {
        return this.userName90;
    }
    public long getMoney()
    {
        return this.money;
    }

}
