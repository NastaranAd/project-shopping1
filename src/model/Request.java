package model;

public class Request
{
int t;
private String userName90;
    private String email;
    private String phoneNumber;
    private String password;
    private int index;
private long money;
public Request(String userName,long money)
{
    this.userName90=userName;
    this.money=money;

}
public Request(String email,String userName,String phoneNumber,String password)
{
    this.userName90=userName;
    this.password=password;
    this.phoneNumber=phoneNumber;
    this.email=email;

}
public Request(int index)
{
    this.index=index;
}
public String getUserName90()
    {
        return this.userName90;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getPassword()
    {
        return this.password;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public long getMoney()
    {
        return this.money;
    }
    public int getIndex()
    {
       return this.index;
    }

}
