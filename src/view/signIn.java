package view;

import model.*;
import model.Shopper;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class signIn {
    String email;
    String password;
    String phoneNumber;
    String userName;
    int index1;
    Scanner cin = new Scanner(System.in);
    controller.Shopper admin3 = new controller.Shopper();

    public void signIn1() {
        boolean helper = false;
        while (helper == false) {
            cin.nextLine();
            System.out.println("please enter your email : ");
            email = cin.nextLine();
            Pattern pattern = Pattern.compile("^\\w+@(gmail|yahoo)\\.com$");
            Matcher matcher = pattern.matcher(email);
            boolean found = matcher.find();
            if (found == true) {
                helper = true;
            }
        }
        boolean helper1 = false;
        while (helper1 == false) {
            cin.nextLine();
            System.out.println("please enter your password : ");
            password = cin.nextLine();
            Pattern pattern1 = Pattern.compile("^09\\d{9}$");
            Matcher matcher = pattern1.matcher(password);
            boolean found1 = matcher.find();
            if (found1 == true) {
                helper1 = true;
            }
        }
        boolean helper2 = false;
        while (helper2 == false) {
            cin.nextLine();
            System.out.println("please enter your phone number : ");
            phoneNumber = cin.nextLine();
            Pattern pattern2 = Pattern.compile("^09\\d{9}$");
            Matcher matcher = pattern2.matcher(phoneNumber);
            boolean found2 = matcher.find();
            if (found2 == true) {
                helper2 = true;
            }
        }
        cin.nextLine();
        System.out.println("please enter your username : ");
        userName = cin.nextLine();
        cin.nextLine();
        System.out.println("   ");
        System.out.println("your log in request has sent to admin");
        Request request = new Request(email, userName, phoneNumber, password);
        Request request1 = new Request(userName, 0);
        Admin1.getAdmin1().getSignInRequests().add(request);
        Admin1.getAdmin1().getSignInRequests().add(request1);

    }

    public void printCharacter() {
        System.out.println("1.sign in");
        System.out.println("2.log in");
        System.out.println("3.the list of products");
        System.out.println("4.EXIT");
        System.out.println("      ");
    }

    public void printChoice() {
        System.out.println("1.admin");
        System.out.println("2.shopper");
        System.out.println("3.EXIT");
    }

    public void printOpinionMenu() {
        System.out.println("1.other");
        System.out.println("2.EXIT");
    }

    public void printRequest() {
        if (Admin1.getAdmin1().getSignInRequests().size() != 0) {
            for (int i = 0; i < Admin1.getAdmin1().getSignInRequests().size(); i = i + 2) {
                System.out.println(Admin1.getAdmin1().getSignInRequests().get(i).getUserName90() + " " + "this user wants to log in");
                cin.nextLine();
                System.out.println("do you want to accept the user ? ");
                String choice = cin.nextLine();
                if (Objects.equals(choice, "yes")) {
                    Shopper shopper = new Shopper(Admin1.getAdmin1().getSignInRequests().get(i).getEmail(), Admin1.getAdmin1().getSignInRequests().get(i).getPassword(), Admin1.getAdmin1().getSignInRequests().get(i).getPhoneNumber(), Admin1.getAdmin1().getSignInRequests().get(i).getUserName90(), 0);
                    Admin1.getAdmin1().getShoppers().add(shopper);
                    Request1 request1 = new Request1(i);
                    Admin1.getAdmin1().getRequest1s().add(request1);
                    System.out.println("you add this user" + " " + Admin1.getAdmin1().getSignInRequests().get(i).getUserName90());
                }
                if (Objects.equals(choice, "no")) {
                    System.out.println("you did not add shopper");
                }
            }
        } else if (Admin1.getAdmin1().getSignInRequests().size() == 0) {
            System.out.println("you do not have any log in request");
        }

    }

    public void printRequestMoney() {
        if (Admin1.getAdmin1().getRequestsMoney().size() != 0) {
            for (int i = 0; i < Admin1.getAdmin1().getRequestsMoney().size(); i++) {
                if (i == Admin1.getAdmin1().getRequestsMoney().size() - 1) {
                    System.out.println(Admin1.getAdmin1().getRequestsMoney().get(i).getUserName90() + "," + "this user wants to increase ");
                    cin.nextLine();
                    System.out.println("do you want to accept the request ? ");
                    String choice = cin.nextLine();
                    if (Objects.equals(choice, "yes")) {
                        System.out.println("new money : " + " " + Admin1.getAdmin1().getShoppers().get(Admin1.getAdmin1().getRequest1s().size()-1).setUserAccountCredentials(Admin1.getAdmin1().getRequestsMoney().get(i).getMoney()) + " " + "of this user : " + Admin1.getAdmin1().getRequestsMoney().get(i).getUserName90());
                    }
                    if (Objects.equals(choice, "no")) {
                        System.out.println("you did not accept the request");
                    }
                }
            }
        } else if (Admin1.getAdmin1().getRequestsMoney().size() == 0) {
            System.out.println("you do not have any money" +
                    " request");
        }

    }

    public void Shopping1(int i) {
        boolean helper = false;
        while (helper == false) {
            cin.nextLine();
            System.out.println("please enter your cart number : ");
            String cartNumber = cin.nextLine();
            Pattern pattern = Pattern.compile("^09\\d{9}$");
            Matcher matcher = pattern.matcher(cartNumber);
            boolean found = matcher.find();
            if (found == true) {
                helper = true;
            }
        }
        boolean helper1 = false;
        while (helper1 == false) {
            cin.nextLine();
            System.out.println("please enter your password : ");
            String password99 = cin.nextLine();
            Pattern pattern1 = Pattern.compile("^09\\d{9}$");
            Matcher matcher = pattern1.matcher(password99);
            boolean found1 = matcher.find();
            if (found1 == true) {
                helper1 = true;
            }
        }
        boolean helper2 = false;
        while (helper2 == false) {
            cin.nextLine();
            System.out.println("please enter your cvv2 : ");
            String cvv2 = cin.nextLine();
            Pattern pattern2 = Pattern.compile("^09\\d{9}$");
            Matcher matcher = pattern2.matcher(cvv2);
            boolean found2 = matcher.find();
            if (found2 == true) {
                helper2 = true;
            }
        }
        cin.nextLine();
        System.out.println("you bought the thing that you want");
        cin.nextLine();
        System.out.println("do you want to send your opinion about the products that you just bought?");
        String opinion = cin.nextLine();
        if (Objects.equals(opinion, "yes")) {
            cin.nextLine();
            printOpinionMenu();
            int choice99 = cin.nextInt();
            while (choice99 != 2) {
                System.out.println("which product do you want to ");
                cin.nextLine();
                System.out.println(admin3.showBaskest(i));
                cin.nextLine();
                System.out.println("please enter the name : ");
                String name1000 = cin.nextLine();
                showOpinion(name1000, i);
                cin.nextLine();
                printOpinionMenu();
                choice99 = cin.nextInt();
            }
        }
        if (Objects.equals(opinion, "no")) {
            System.out.println("you did not send your opinion");
        }

    }

    public void Shopping(String name1, int index) {
        boolean bool = false;
        for (int l = 0; l < Admin1.getAdmin1().getProducts().size(); l++) {
            if (Objects.equals(Admin1.getAdmin1().getProducts().get(l).getProductName(), name1)) {
                bool = true;
                long sum = 0;
                for (int j = 0; j < Admin1.getAdmin1().getShoppers().get(index).getBaskets().size(); j++) {
                    sum = sum + Admin1.getAdmin1().getShoppers().get(index).getBaskets().get(j).getMoney100();
                }
                if (Admin1.getAdmin1().getProducts().get(l).getCapacity() - 1 >= 0) {
                    if (sum + Admin1.getAdmin1().getProducts().get(l).getProductPrice() <= Admin1.getAdmin1().getShoppers().get(index).getUserAccountCredentials()) {
                        Basket shop = new Basket(Admin1.getAdmin1().getProducts().get(l).getProductName(), sum + Admin1.getAdmin1().getProducts().get(l).getProductPrice());
                        Admin1.getAdmin1().getShoppers().get(index).getBaskets().add(shop);
                        Admin1.getAdmin1().getBaskets().add(shop);
                        Admin1.getAdmin1().getShoppers().get(index).setUserAccountCredentialsShopper(sum + Admin1.getAdmin1().getProducts().get(l).getProductPrice());
                        Factor factor = new Factor("4/4", Admin1.getAdmin1().getProducts().get(l).getProductPrice(), Admin1.getAdmin1().getProducts().get(l).getProductName());
                        Admin1.getAdmin1().getShoppers().get(index).getFactors().add(factor);
                        System.out.println("you take the thing that you want ");
                        Admin1.getAdmin1().getProducts().get(l).setProductCapacitymines();
                        index1 = l;
                    } else {
                        System.out.println("you do not have enough money in your bank account");
                    }
                } else {
                    System.out.println("you can not get this product because we do not have it anymore");
                }
            }

        }
        if (bool == false) {
            System.out.println("we do not have this product");
        }
    }

    public void changeName() {
        System.out.println(admin3.Showing());
        cin.nextLine();
        System.out.println("which product do you want to change the name ?");
        String name = cin.nextLine();
        for (int k = 0; k < Admin1.getAdmin1().getProducts().size(); k++) {
            if (Objects.equals(name, Admin1.getAdmin1().getProducts().get(k).getProductName())) {
                cin.nextLine();
                System.out.println("please enter the new name of product : ");
                String name1 = cin.nextLine();
                Admin1.getAdmin1().getProducts().get(k).setProductName(name1);
                System.out.println("the new name of product " + Admin1.getAdmin1().getProducts().get(k).getProductName());
            } else {
                System.out.println("we do not have this product");
            }
        }

    }

    public void changeCapacity() {
        System.out.println(admin3.Showing());
        cin.nextLine();
        System.out.println("which product do you want to change the capacity ?");
        String name = cin.nextLine();
        for (int k = 0; k < Admin1.getAdmin1().getProducts().size(); k++) {
            if (Objects.equals(name, Admin1.getAdmin1().getProducts().get(k).getProductName())) {
                cin.nextLine();
                System.out.println("please enter the new capacity of product : ");
                int capacity1 = cin.nextInt();
                Admin1.getAdmin1().getProducts().get(k).setProductCapacity(capacity1);
                System.out.println("the new capacity of this product -> " + Admin1.getAdmin1().getProducts().get(k).getProductName() + "is" + Admin1.getAdmin1().getProducts().get(k).getCapacity());
            } else {
                System.out.println("we do not have this product");
            }
        }

    }

    public void changePrice() {
        System.out.println(admin3.Showing());
        cin.nextLine();
        System.out.println("which product do you want to change the price ?");
        String name = cin.nextLine();
        for (int k = 0; k < Admin1.getAdmin1().getProducts().size(); k++) {
            if (Objects.equals(name, Admin1.getAdmin1().getProducts().get(k).getProductName())) {
                cin.nextLine();
                System.out.println("please enter the new price of product : ");
                long price = cin.nextLong();
                Admin1.getAdmin1().getProducts().get(k).setProductprice(price);
                System.out.println("the new price of this product -> " + Admin1.getAdmin1().getProducts().get(k).getProductName() + "is" + Admin1.getAdmin1().getProducts().get(k).getProductPrice());
            } else {
                System.out.println("we do not have this product");
            }
        }

    }

    public void showOpinion(String name900, int j) {
        for (int i = 0; i < Admin1.getAdmin1().getShoppers().get(j).getBaskets().size(); i++) {
            if (Objects.equals(name900, Admin1.getAdmin1().getShoppers().get(j).getBaskets().get(i).getProductName100())) {
                System.out.println("please enter one number between 1 to 5");
                int number200 = cin.nextInt();
                cin.nextLine();
                System.out.println("please enter your opinion : ");
                String opinion = cin.nextLine();
                Opinion opinion1 = new Opinion(Admin1.getAdmin1().getShoppers().get(j).getBaskets().get(i).getProductName100(), opinion, number200);
                Admin1.getAdmin1().getOpinion().add(opinion1);
                Opinion opinion2 = new Opinion(j);
                Admin1.getAdmin1().getOpinion().add(opinion2);
                System.out.println("your opinion has send to admin");
            }
        }


    }

    public void showOpinionRequest() {

        for (int e = 0; e < Admin1.getAdmin1().getOpinion().size(); e++) {
            if (e % 2 == 0) {
                System.out.println("this user " + Admin1.getAdmin1().getShoppers().get(Admin1.getAdmin1().getOpinion().get(e + 1).getIndex()).getUserName() + " " + "wants to send the score for " + Admin1.getAdmin1().getOpinion().get(e).getProductName1000());
                cin.nextLine();
                System.out.println("do you accept the request?");
                String choice45 = cin.nextLine();
                if (Objects.equals(choice45, "yes")) {
                    double sum20 = 0;
                    int counter = 0;
                    if (Admin1.getAdmin1().getShoppers().size()>1) {
                        for (int p = 0; p < Admin1.getAdmin1().getBaskets().size(); p++) {
                            if (Objects.equals(Admin1.getAdmin1().getOpinion().get(e).getProductName1000(), Admin1.getAdmin1().getBaskets().get(p).getProductName100())) {
                                counter = counter + 2;
                                sum20 = sum20 + Admin1.getAdmin1().getOpinion().get(e).getScore();
                                sum20 = sum20 / counter;
                            }
                        }
                        for (int w = 0; w < Admin1.getAdmin1().getProducts().size(); w++) {
                            if (Objects.equals(Admin1.getAdmin1().getProducts().get(w).getProductName(), Admin1.getAdmin1().getOpinion().get(e).getProductName1000())) {
                                System.out.println(Admin1.getAdmin1().getProducts().get(w).setProductScore(sum20));
                                System.out.println(Admin1.getAdmin1().getProducts().get(w).setProductcomment(Admin1.getAdmin1().getOpinion().get(e).getCommentText()));
                            }
                        }
                    }
                    if (Admin1.getAdmin1().getShoppers().size()<=1) {
                        for (int p = 0; p < Admin1.getAdmin1().getBaskets().size(); p++) {
                            if (Objects.equals(Admin1.getAdmin1().getOpinion().get(e).getProductName1000(), Admin1.getAdmin1().getBaskets().get(p).getProductName100())) {
                                counter = counter + 1;
                                sum20 = sum20 + Admin1.getAdmin1().getOpinion().get(e).getScore();
                                sum20 = sum20 / counter;
                            }
                        }
                        for (int w = 0; w < Admin1.getAdmin1().getProducts().size(); w++) {
                            if (Objects.equals(Admin1.getAdmin1().getProducts().get(w).getProductName(), Admin1.getAdmin1().getOpinion().get(e).getProductName1000())) {
                                System.out.println(Admin1.getAdmin1().getProducts().get(w).setProductScore(sum20));
                                System.out.println(Admin1.getAdmin1().getProducts().get(w).setProductcomment(Admin1.getAdmin1().getOpinion().get(e).getCommentText()));
                            }
                        }
                    }

                }
                if (Objects.equals(choice45, "no")) {
                    System.out.println("you did not accept the request");
                }
            }

        }
    }

}

