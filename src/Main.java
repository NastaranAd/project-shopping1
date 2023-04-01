import model.Admin1;
import view.signIn;
import view.logIn;
import view.Admin60;
import controller.Admin;
public class Main {
    public static void main(String[] args) {
    Admin1.getAdmin1("admin","admin");
    Admin add = new Admin();
    add.add(Admin1.getAdmin1());
    Admin60 admin60 = new Admin60();
    signIn user = new signIn();
    logIn user1= new logIn();
    user.signIn1();
    admin60.adminDuty();
    user1.logIn();
    }
}