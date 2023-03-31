import model.Admin1;
import view.signIn;
import view.logIn;
public class Main {
    public static void main(String[] args) {
    Admin1.getAdmin1("admin","admin");
    signIn user = new signIn();
    logIn user1= new logIn();
    user.signIn1();
    user.printRequest();
    user1.logIn();

    }
}