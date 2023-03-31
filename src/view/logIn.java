package view;
import java.util.Scanner;
import model.Product;
import model.Admin1;
import model.*;
import java.util.Objects;
public class logIn
{

  Scanner cin = new Scanner (System.in);
  public void logIn()
  {
    cin.nextLine();
    System.out.println("please enter your email");
    String email = cin.nextLine();
    System.out.println("please enter your password");
    String password = cin.nextLine();
    System.out.println("please enter your phone number");
    String phoneNumber= cin.nextLine();
    for (int i = 0;i<Admin1.getAdmin1().getShoppers().size();i++)
      if (Objects.equals(Admin1.getAdmin1().getShoppers().get(i).getEmail(),email)&&Objects.equals(Admin1.getAdmin1().getShoppers().get(i).getPassword(),password)&&Objects.equals(Admin1.getAdmin1().getShoppers().get(i).getPhoneNumber(),phoneNumber))
    {
      System.out.println("        *****     WELCOME     *****");
      printMenu();
      System.out.println("please enter your choice : ");
      int choice1 = cin.nextInt();



    }


  }
  public void printMenu ()
  {
    System.out.println("1.the information of your account");
    System.out.println("2.View the goods");
    System.out.println("3.shopping");
    System.out.println("4.increase account credit");
    System.out.println("5.Invoice display");

  }

}

