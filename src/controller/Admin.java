package controller;

import model.Computer;
import model.Product;
import view.signIn;
import model.Admin1;
import model.Car;
import model.*;

import java.util.Objects;

public class Admin {

    signIn user1 = new signIn();

    public StringBuilder signInRequest() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int o = 0; o < Admin1.getAdmin1().getSignInRequests().size(); o++) {
            stringBuilder.append(Admin1.getAdmin1().getSignInRequests().get(o).getUserName90() + " " + "wants to log in");
        }
        return stringBuilder;
    }


    public void add(Admin1 admin2) {
        Car product1 = new Car("BMW", 1000, 1, 3, Product.category.VEHICLES, "BMW", true, 3500);
        Food product2 = new Food("nodel", 10, 2, 3, Product.category.FOOD, "4/8", "12/12");
        Computer product3 = new Computer("ASUS", 450, 3, 3, Product.category.DIGITAL, 4.5, 80.4, 4, "intel core i5");
        noteBook product4 = new noteBook("book", 90, 4, 2, Product.category.STATIONARY, "IRAN", "Wove", 100);
        admin2.getProducts().add(product1);
        admin2.getProducts().add(product2);
        admin2.getProducts().add(product3);
        admin2.getProducts().add(product4);
        admin2.getVehicles().add(product1);
        admin2.getStationaries().add(product4);

    }

    public void showSignRequest(String order) {
        String[] words = order.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (Objects.equals(words[i], "sign"))
            {
               user1.printRequest();
            }
        }

    }
    public void showMoneyRequest(String order) {
        String[] words = order.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (Objects.equals(words[i], "money"))
            {
                user1.printRequestMoney(0);
            }
        }

    }
    public void addingAdmin(String order) {
        String[] words = order.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (Objects.equals(words[i], "Add"))
            {
                if (Objects.equals(words[i+1],"Car"))
                {
                    boolean auto;
                    int price = Integer.parseInt(words[i+6]);
                    int capacity = Integer.parseInt(words[i+7]);
                    double volume = Integer.parseInt(words[i+2]);
                    if (Objects.equals(words[i+3],"true"))
                    {
                        auto=true;
                    }
                    else
                    {
                        auto = false;
                    }
                    Car car = new Car(words[i+5],price,1,capacity, Product.category.VEHICLES,words[i+4],auto,volume);
                    Admin1.getAdmin1().getProducts().add(car);
                }
                if (Objects.equals(words[i+1],"Bikecycle"))
                {
                    int price = Integer.parseInt(words[i+5]);
                    int capacity = Integer.parseInt(words[i+6]);
                    Bikecycle bike = new Bikecycle(words[i+4],price,1,capacity, Product.category.VEHICLES,words[i+3], Bikecycle.bikecycle.valueOf(words[i+2]));
                    Admin1.getAdmin1().getProducts().add(bike);
                }
                if (Objects.equals(words[i+1],"Computer"))
                {
                    int price = Integer.parseInt(words[i+3]);
                    int capacity = Integer.parseInt(words[i+8]);
                    double weight = Integer.parseInt(words[i+4]);
                    double dimention = Integer.parseInt(words[i+5]);
                    int RAM = Integer.parseInt(words[i+6]);
                    Computer computer = new Computer(words[i+2],price,1,capacity, Product.category.DIGITAL,weight,dimention,RAM,words[i+7]);
                    Admin1.getAdmin1().getProducts().add(computer);
                }
                if (Objects.equals(words[i+1],"information"))
                {
                    int price = Integer.parseInt(words[i+3]);
                    int capacity = Integer.parseInt(words[i+6]);
                    double weight = Integer.parseInt(words[i+4]);
                    double dimension = Integer.parseInt(words[i+5]);
                    informationStorage informationStorage=new informationStorage(words[i+2],price,1,capacity, Product.category.DIGITAL,weight,dimension);
                    Admin1.getAdmin1().getProducts().add(informationStorage);

                }
                if (Objects.equals(words[i+1],"Flash"))
                {
                    int price = Integer.parseInt(words[i+3]);
                    int capacity = Integer.parseInt(words[i+7]);
                    double weight = Integer.parseInt(words[i+4]);
                    double dimension = Integer.parseInt(words[i+5]);
                    Flash flash = new Flash(words[i+2],price,1,capacity,Product.category.DIGITAL,weight,dimension,words[i+6]);
                    Admin1.getAdmin1().getProducts().add(flash);
                }

            }
        }

    }

}
