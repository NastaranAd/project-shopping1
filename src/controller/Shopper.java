package controller;
import model.Admin1;
import model.Factor;
import model.Product;

import java.util.ArrayList;

public class Shopper {
    public StringBuilder Showing()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < Admin1.getAdmin1().getProducts().size(); j++) {
            stringBuilder.append(j+1+"."+Admin1.getAdmin1().getProducts().get(j).getProductName()+"\n");
            stringBuilder.append(j+1+"."+Admin1.getAdmin1().getProducts().get(j).getProductPrice()+"\n");
            stringBuilder.append(j+1+"."+Admin1.getAdmin1().getProducts().get(j).getCategory()+"\n");
            stringBuilder.append("\n");
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
    public StringBuilder filterByPrice(long max,long min)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(int k=0 ; k<Admin1.getAdmin1().getProducts().size();k++)
            if ((min<=Admin1.getAdmin1().getProducts().get(k).getProductPrice())&&(Admin1.getAdmin1().getProducts().get(k).getProductPrice()<=max)) {
                stringBuilder.append(Admin1.getAdmin1().getProducts().get(k).getProductName() + "\n");
                stringBuilder.append(Admin1.getAdmin1().getProducts().get(k).getCategory() + "\n");
                stringBuilder.append("\n");
            }
        return stringBuilder;
    }
    public StringBuilder filterBycapacity()
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(int k=0 ; k<Admin1.getAdmin1().getProducts().size();k++)
            if (Admin1.getAdmin1().getProducts().get(k).getCapacity()>0){
                stringBuilder.append(Admin1.getAdmin1().getProducts().get(k).getProductName() + "\n");
                stringBuilder.append(Admin1.getAdmin1().getProducts().get(k).getCategory() + "\n");
                stringBuilder.append(Admin1.getAdmin1().getProducts().get(k).getCategory()+"\n");
                stringBuilder.append("\n");
            }
        return stringBuilder;
    }

}
