package controller;
import model.Product;
import view.signIn;
import model.Admin1;
public class Admin {
    signIn user1 = new signIn();

    public void Request() {
        user1.printRequest();
    }

    public void add(Admin1 admin2) {
        Product product1 = new Product("BMW", 1000, 1, 3, Product.category.VEHICLES);
        Product product2 = new Product("nodel", 10, 1, 3, Product.category.FOOD);
        Product product3 = new Product("computer", 450, 1, 3, Product.category.DIGITAL);
        Product product4 = new Product("notebook", 90, 1, 3, Product.category.STATIONARY);
        admin2.getProducts().add(product1);
        admin2.getProducts().add(product2);
        admin2.getProducts().add(product3);
        admin2.getProducts().add(product4);

    }
}
