package controller;
import model.Product;
import view.signIn;
import model.Admin1;
public class Admin
{
    signIn user1 =new signIn();
    Admin1 admin1 = new Admin1("admin","admin");

    public void Request()
    {
        user1.printRequest();
    }

    public void add()
    {


    }
}
