package controller;
import model.Computer;
import model.Product;
import view.signIn;
import model.Admin1;
import model.Car;

import java.util.Objects;


public class Admin {
    Computer computer = new Computer("asus",900,5,5,Product.category.DIGITAL,4.5,80,4,"ninanay");
    signIn user1 = new signIn();
    public void Request() {
        user1.printRequest();
    }

    public void add(Admin1 admin2) {
        Car product1 = new Car("BMW", 1000,1 , 3, Product.category.VEHICLES,"BMW",true,3500);
        Product product2 = new Product("nodel", 10, 2, 3, Product.category.VEHICLES);
        Computer product3 = new Computer("ASUS", 450,3 , 3, Product.category.DIGITAL,4.5,80.4,4,"intel core i5");
        Product product4 = new Product("notebook", 90, 4, 3, Product.category.STATIONARY);
        admin2.getProducts().add(product1);
        admin2.getProducts().add(product2);
        admin2.getProducts().add(product3);
        admin2.getProducts().add(product4);

    }


}
