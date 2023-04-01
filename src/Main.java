import model.Admin1;
import view.signIn;
import view.logIn;
import controller.Admin;
public class Main {
    public static void main(String[] args) {
    Admin1.getAdmin1("admin","admin");
    Admin add = new Admin();
    add.add(Admin1.getAdmin1());
    signIn user = new signIn();
    logIn user1= new logIn();
    user.signIn1();
    user.signIn1();
    user.printRequest();


    }
}