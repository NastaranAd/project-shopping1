package controller;
import model.Product;
import view.signIn;
import model.Admin1;

import java.util.Objects;


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
    public StringBuilder Showing()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < Admin1.getAdmin1().getProducts().size(); j++) {
            stringBuilder.append(j+1+"."+Admin1.getAdmin1().getProducts().get(j).getProductName()+"\n");
            stringBuilder.append(j+1+"."+Admin1.getAdmin1().getProducts().get(j).getProductPrice()+"\n");
            stringBuilder.append(j+1+"."+Admin1.getAdmin1().getProducts().get(j).getCategory()+"\n");
            System.out.println("    ");
        }
        return stringBuilder;
    }
    public StringBuilder filterByCategory(Product.category kind)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(int k=0 ; k<Admin1.getAdmin1().getProducts().size();k++)
            if ((kind.compareTo(Admin1.getAdmin1().getProducts().get(k).product)==0))
            {
                stringBuilder.append((Admin1.getAdmin1().getProducts().get(k).getProductName())+"\n");
            }
        return stringBuilder;
    }
}
