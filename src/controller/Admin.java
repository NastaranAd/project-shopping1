package controller;

import model.Computer;
import model.Product;
import view.signIn;
import model.Admin1;
import model.Car;
import model.*;

import java.util.Objects;

public class Admin {

    Shopper admin = new Shopper();
    signIn user1 = new signIn();

    public void add(Admin1 admin2) {
        Car product1 = new Car("BMW", 1000, 0, 3, Product.category.VEHICLES, "BMW", true, 3500);
        Food product2 = new Food("nodel", 10, 0, 3, Product.category.FOOD, "4/8", "12/12");
        Computer product3 = new Computer("ASUS", 450, 0, 3, Product.category.DIGITAL, 4.5, 80.4, 4, "intel core i5");
        noteBook product4 = new noteBook("book", 90, 0, 2, Product.category.STATIONARY, "IRAN", "Wove", 100);
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
            if (Objects.equals(words[i], "sign")) {
                user1.printRequest();
            }
        }

    }

    public void showMoneyRequest(String order) {
        String[] words = order.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (Objects.equals(words[i], "money")) {
                user1.printRequestMoney(0);
            }
        }

    }
    public void showOpnionRequest(String order) {
        String[] words = order.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (Objects.equals(words[i], "opinion"))
            {
                user1.showOpinionRequst();
            }
        }

    }

    public void addingAdmin(String order) {
        String[] words = order.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (Objects.equals(words[i], "Add")) {
                if (Objects.equals(words[i + 1], "car")) {
                    boolean auto;
                    int price = Integer.parseInt(words[i + 6]);
                    int capacity = Integer.parseInt(words[i + 7]);
                    double volume = Integer.parseInt(words[i + 2]);
                    if (Objects.equals(words[i + 3], "true")) {
                        auto = true;
                    } else {
                        auto = false;
                    }
                    Car car = new Car(words[i + 5], price, 0, capacity, Product.category.VEHICLES, words[i + 4], auto, volume);
                    Admin1.getAdmin1().getProducts().add(car);
                } else if (Objects.equals(words[i + 1], "bikecycle")) {
                    int price = Integer.parseInt(words[i + 5]);
                    int capacity = Integer.parseInt(words[i + 6]);
                    Bikecycle bike = new Bikecycle(words[i + 4], price, 0, capacity, Product.category.VEHICLES, words[i + 3], Bikecycle.bikecycle.valueOf(words[i + 2]));
                    Admin1.getAdmin1().getProducts().add(bike);
                } else if (Objects.equals(words[i + 1], "computer")) {
                    int price = Integer.parseInt(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 8]);
                    double weight = Integer.parseInt(words[i + 4]);
                    double dimention = Integer.parseInt(words[i + 5]);
                    int RAM = Integer.parseInt(words[i + 6]);
                    Computer computer = new Computer(words[i + 2], price, 0, capacity, Product.category.DIGITAL, weight, dimention, RAM, words[i + 7]);
                    Admin1.getAdmin1().getProducts().add(computer);
                } else if (Objects.equals(words[i + 1], "information")) {
                    int price = Integer.parseInt(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 6]);
                    double weight = Integer.parseInt(words[i + 4]);
                    double dimension = Integer.parseInt(words[i + 5]);
                    informationStorage informationStorage = new informationStorage(words[i + 2], price, 0, capacity, Product.category.DIGITAL, weight, dimension);
                    Admin1.getAdmin1().getProducts().add(informationStorage);

                } else if (Objects.equals(words[i + 1], "flash")) {
                    int price = Integer.parseInt(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 7]);
                    double weight = Integer.parseInt(words[i + 4]);
                    double dimension = Integer.parseInt(words[i + 5]);
                    Flash flash = new Flash(words[i + 2], price, 0, capacity, Product.category.DIGITAL, weight, dimension, words[i + 6]);
                    Admin1.getAdmin1().getProducts().add(flash);
                } else if (Objects.equals(words[i + 1], "SSD")) {
                    int price = Integer.parseInt(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 9]);
                    double weight = Integer.parseInt(words[i + 4]);
                    double dimension = Integer.parseInt(words[i + 5]);
                    double readingSpeed = Integer.parseInt(words[i + 7]);
                    double writingSpeed = Integer.parseInt(words[i + 8]);
                    SSD ssd = new SSD(words[i + 2], price, 0, capacity, Product.category.DIGITAL, weight, dimension, words[i + 6], readingSpeed, writingSpeed);
                    Admin1.getAdmin1().getProducts().add(ssd);
                } else if (Objects.equals(words[i + 1], "pen")) {
                    int price = Integer.parseInt(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 6]);
                    Pen pen = new Pen(words[i + 2], price, 0, capacity, Product.category.STATIONARY, words[i + 4], words[i + 5]);
                    Admin1.getAdmin1().getProducts().add(pen);
                } else if (Objects.equals(words[i + 1], "Pencil")) {
                    int price = Integer.parseInt(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 6]);
                    Pencil pencil = new Pencil(words[i + 2], price, 0, capacity, Product.category.STATIONARY, words[i + 4], Pencil.pencil.valueOf(words[i + 5]));
                    Admin1.getAdmin1().getProducts().add(pencil);
                } else if (Objects.equals(words[i + 1], "notebook")) {
                    long price = Integer.parseInt(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 7]);
                    int page = Integer.parseInt(words[i + 6]);
                    noteBook noteBook = new noteBook(words[i + 2], price, 0, capacity, Product.category.STATIONARY, words[i + 4], words[i + 5], page);
                    Admin1.getAdmin1().getProducts().add(noteBook);
                } else if (Objects.equals(words[i + 1], "food")) {
                    long price = Integer.parseInt(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 6]);
                    Food food = new Food(words[i + 2], price, 0, capacity, Product.category.FOOD, words[i + 4], words[i + 5]);
                    Admin1.getAdmin1().getProducts().add(food);
                }


            }

        }
    }

    public void removeAdmin(String order,String name ) {

            String[] words = order.split("\\s");
            for (int i = 0; i < words.length; i++) {
                if (Objects.equals(words[i], "Remove")) {
                        for (int r=0;r<Admin1.getAdmin1().getProducts().size();r++) {
                            if (Objects.equals(name, Admin1.getAdmin1().getProducts().get(r).getProductName())) {
                                Admin1.getAdmin1().getProducts().remove(r);
                            }
                        }
                    }
                }

            }
            public void changingInformationName(String order)
            {
                String[] words = order.split("\\s");
                for (int t =0 ;t< words.length;t++)
                {
                    if (Objects.equals(words[t],"Change"))
                    {
                        if (Objects.equals(words[t+1],"name"))
                        {
                           user1.changeName();
                        }
                    }
                }

            }
    public void changingInformationCapacity(String order) {
        String[] words = order.split("\\s");
        for (int t = 0; t < words.length; t++) {
            if (Objects.equals(words[t], "Change")) {
                if (Objects.equals(words[t + 1], "capacity")) {
                    user1.changeCapacity();
                }
            }

        }

    }
    public void changingInformationPrice(String order) {
        String[] words = order.split("\\s");
        for (int t = 0; t < words.length; t++) {
            if (Objects.equals(words[t], "Change")) {
                if (Objects.equals(words[t + 1], "price")) {
                    user1.changePrice();
                }
            }

        }

    }
}
