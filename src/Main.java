import model.Admin1;
import view.signIn;
import view.logIn;
import view.Admin60;
import controller.Admin;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    Admin1.getAdmin1("admin","admin");
    Admin add = new Admin();
    add.add(Admin1.getAdmin1());
    Admin60 admin60 = new Admin60();
    signIn user = new signIn();
    logIn user1= new logIn();
    //user.signIn1();
    //admin60.adminDuty();
    //user1.logIn();
    System.out.println("       *****     WELCOME     *****");
    cin.nextLine();
    user.printCharacter();
    System.out.println("please enter your choice : ");
    int choice8 = cin.nextInt();
    while (choice8!=4)
    {
        if (choice8==1)
        {
            user.signIn1();
        }
        if (choice8==2)
        {
            user.printChoice();
            cin.nextLine();
            System.out.println("please enter your choice : ");
            int choice9 = cin.nextInt();
            while (choice9!=3)
            {
                if (choice9==1)
                {
                    admin60.adminDuty();
                }
                if (choice9==2)
                {
                    user1.logIn1();
                }
                user.printChoice();
                cin.nextLine();
                System.out.println("please enter your choice : ");
                choice9 = cin.nextInt();
            }

        }
        if (choice8==3)
        {

        }
        user.printCharacter();
        System.out.println("please enter your choice : ");
        choice8 = cin.nextInt();
    }


    }
}