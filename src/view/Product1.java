package view;
import java.util.Scanner;
import model.Product;
import model.Admin1;


public class Product1
{

    Admin1 admin1 = new Admin1("admin","admin");
    int counter=0;
    Scanner cin = new Scanner(System.in);

 public void  addProduct()
    {
        cin.nextLine();
        System.out.println("enter product name : ");
        String productName = cin.nextLine();
        System.out.println("enter product price : ");
        long productPrice = cin.nextInt();
        System.out.println("enter product capacity : ");
        int capacity  = cin.nextInt();
        System.out.println("enter product type : ");
        String type= cin .nextLine();
        counter++;
        int productId = counter;
        Product product = new Product(productName,productPrice,productId,capacity,Product.category.valueOf(type));
        admin1.getProducts().add(product);
    }
}
