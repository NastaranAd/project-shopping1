package Controller;

import Model.*;
import View.signIn;

import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Objects;

public class Admin {

    signIn user1 = new signIn();

    public void add(Admin1 admin2) {
        Car product1 = new Car("BMW", 1000, 0, 3, Product.category.VEHICLES, "BMW", true, 3500, "nothing");
        Food product2 = new Food("ASUS", 10, 0, 3, Product.category.FOOD, "4/8", "12/12", "nothing");
        Computer product3 = new Computer("ASUS", 450, 0, 3, Product.category.DIGITAL, 4.5, 80.4, 4, "intel core i5", "nothing");
        noteBook product4 = new noteBook("book", 90, 0, 2, Product.category.STATIONARY, "IRAN", "Wove", 100, "nothing");
        admin2.getProducts().add(product1);
        admin2.getProducts().add(product2);
        admin2.getProducts().add(product3);
        admin2.getProducts().add(product4);
        admin2.getVehicles().add(product1);
        admin2.getStationaries().add(product4);
        admin2.getDigitals().add(product3);
        admin2.getFoods().add(product2);
        Collections.sort(Admin1.getAdmin1().getProducts());

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
                user1.printRequestMoney();
            }
        }

    }

    public void showOpinionRequest(String order) {
        String[] words = order.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (Objects.equals(words[i], "opinion")) {
                user1.showOpinionRequest();
            }
        }

    }

    public void addingAdmin(String order) {
        String[] words = order.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (Objects.equals(words[i], "Add")) {
                if (Objects.equals(words[i + 1], "car")) {
                    boolean auto;
                    Double price = Double.parseDouble(words[i + 6]);
                    try {
                        price = Double.parseDouble(words[i + 6]);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid price");
                    }
                    int capacity = Integer.parseInt(words[i + 7]);
                    try {
                        capacity= Integer.parseInt(words[i + 7]);
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Invalid capacity");
                    }
                    double volume = Double.parseDouble(words[i + 2]);
                    try {
                        volume = Integer.parseInt(words[i + 2]);
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Invalid value");
                    }

                    if (Objects.equals(words[i + 3], "true")) {
                        auto = true;
                    } else {
                        auto = false;
                    }
                    Car car = new Car(words[i + 5], price, 0, capacity, Product.category.VEHICLES, words[i + 4], auto, volume, "nothing");
                    Admin1.getAdmin1().getProducts().add(car);
                    Admin1.getAdmin1().getVehicles().add(car);
                    Collections.sort( Admin1.getAdmin1().getProducts());
                } else if (Objects.equals(words[i + 1], "bikeCycle")) {
                    double price = Double.parseDouble(words[i + 5]);
                    try{
                        price = Double.parseDouble(words[i + 5]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid price");
                    }

                    int capacity = Integer.parseInt(words[i + 6]);
                    try{
                        capacity = Integer.parseInt(words[i + 6]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid capacity");
                    }
                    bikeCycle bike = new bikeCycle(words[i + 4], price, 0, capacity, Product.category.VEHICLES, words[i + 3], bikeCycle.bikeCycle1.valueOf(words[i + 2]), "nothing");
                    Admin1.getAdmin1().getProducts().add(bike);
                    Admin1.getAdmin1().getVehicles().add(bike);
                    Collections.sort( Admin1.getAdmin1().getProducts());
                } else if (Objects.equals(words[i + 1], "computer")) {
                    double price = Double.parseDouble(words[i + 3]);
                    try{
                        price = Double.parseDouble(words[i + 3]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid price");
                    }
                    int capacity = Integer.parseInt(words[i + 8]);
                    try{
                        capacity = Integer.parseInt(words[i + 8]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid price");
                    }
                    double weight = Integer.parseInt(words[i + 4]);
                    double dimension = Integer.parseInt(words[i + 5]);
                    int RAM = Integer.parseInt(words[i + 6]);
                    try{
                        weight = Double.parseDouble(words[i + 4]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid weight");
                    }
                    try{
                        dimension = Double.parseDouble(words[i + 5]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid dimension");
                    }
                    try{
                        RAM = Integer.parseInt(words[i + 6]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid RAM");
                    }
                    Computer computer = new Computer(words[i + 2], price, 0, capacity, Product.category.DIGITAL, weight, dimension, RAM, words[i + 7], "nothing");
                    Admin1.getAdmin1().getProducts().add(computer);
                    Admin1.getAdmin1().getDigitals().add(computer);
                    Collections.sort( Admin1.getAdmin1().getProducts());
                } else if (Objects.equals(words[i + 1], "information")) {
                    double price = Double.parseDouble(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 6]);
                    double weight = Double.parseDouble(words[i + 4]);
                    double dimension = Double.parseDouble(words[i + 5]);
                    try{
                        price = Double.parseDouble(words[i + 3]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid price");
                    }
                    try{
                        capacity = Integer.parseInt(words[i + 6]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid capacity");
                    }
                    try{
                        weight = Double.parseDouble(words[i + 4]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid weight");
                    }
                    try{
                        dimension = Double.parseDouble(words[i + 5]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid dimension");
                    }
                    informationStorage informationStorage = new informationStorage(words[i + 2], price, 0, capacity, Product.category.DIGITAL, weight, dimension, "nothing");
                    Admin1.getAdmin1().getProducts().add(informationStorage);
                    Admin1.getAdmin1().getDigitals().add(informationStorage);
                    Collections.sort( Admin1.getAdmin1().getProducts());
                } else if (Objects.equals(words[i + 1], "flash")) {
                    Double price = Double.parseDouble(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 7]);
                    double weight = Double.parseDouble(words[i + 4]);
                    double dimension = Double.parseDouble(words[i + 5]);
                    try{
                        price = Double.parseDouble(words[i + 3]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid price");
                    }
                    try{
                         capacity = Integer.parseInt(words[i + 7]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid capacity");
                    }
                    try{
                        weight = Double.parseDouble(words[i + 4]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid weight");
                    }
                    try{
                        dimension = Double.parseDouble(words[i + 5]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid dimension");
                    }
                    Flash flash = new Flash(words[i + 2], price, 0, capacity, Product.category.DIGITAL, weight, dimension, words[i + 6], "nothing");
                    Admin1.getAdmin1().getProducts().add(flash);
                    Admin1.getAdmin1().getDigitals().add(flash);
                    Collections.sort( Admin1.getAdmin1().getProducts());
                } else if (Objects.equals(words[i + 1], "SSD")) {
                    Double price = Double.parseDouble(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 9]);
                    double weight = Double.parseDouble(words[i + 4]);
                    double dimension = Double.parseDouble(words[i + 5]);
                    double readingSpeed = Double.parseDouble(words[i + 7]);
                    double writingSpeed = Double.parseDouble(words[i + 8]);
                    try{
                        price = Double.parseDouble(words[i + 3]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid price");
                    }
                    try{
                        capacity = Integer.parseInt(words[i + 9]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid capacity");
                    }
                    try{
                        weight = Double.parseDouble(words[i + 4]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid weight");
                    }
                    try{
                        dimension = Double.parseDouble(words[i + 5]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid dimension");
                    }
                    try{
                        readingSpeed = Double.parseDouble(words[i + 7]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid reading speed");
                    }
                    try{
                        writingSpeed = Double.parseDouble(words[i + 8]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid writing speed");
                    }
                    SSD ssd = new SSD(words[i + 2], price, 0, capacity, Product.category.DIGITAL, weight, dimension, readingSpeed, writingSpeed, "nothing");
                    Admin1.getAdmin1().getProducts().add(ssd);
                    Admin1.getAdmin1().getDigitals().add(ssd);
                    Collections.sort( Admin1.getAdmin1().getProducts());
                } else if (Objects.equals(words[i + 1], "pen")) {
                    Double price = Double.parseDouble(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 6]);
                    try{
                        price = Double.parseDouble(words[i + 3]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid price");
                    }
                    try{
                        capacity = Integer.parseInt(words[i + 6]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid capacity");
                    }
                    Pen pen = new Pen(words[i + 2], price, 0, capacity, Product.category.STATIONARY, words[i + 4], words[i + 5], "nothing");
                    Admin1.getAdmin1().getProducts().add(pen);
                    Admin1.getAdmin1().getStationaries().add(pen);
                    Collections.sort( Admin1.getAdmin1().getProducts());
                    for (int u = 0; u < Admin1.getAdmin1().getStationaries().get(u).getPens().size(); u++) {
                        Admin1.getAdmin1().getStationaries().get(u).getPens().add(pen);

                    }
                } else if (Objects.equals(words[i + 1], "pencil")) {
                    Double price = Double.parseDouble(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 6]);
                    try{
                        price = Double.parseDouble(words[i + 3]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid price");
                    }
                    try{
                        capacity = Integer.parseInt(words[i + 6]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid capacity");
                    }
                    Pencil pencil = new Pencil(words[i + 2], price, 0, capacity, Product.category.STATIONARY, words[i + 4], Pencil.pencil.valueOf(words[i + 5]), "nothing");
                    Admin1.getAdmin1().getProducts().add(pencil);
                    Admin1.getAdmin1().getStationaries().add(pencil);
                    Collections.sort( Admin1.getAdmin1().getProducts());
                } else if (Objects.equals(words[i + 1], "notebook")) {
                    Double price = Double.parseDouble(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 7]);
                    int page = Integer.parseInt(words[i + 6]);
                    try{
                        price = Double.parseDouble(words[i + 3]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid price");
                    }
                    try{
                        capacity = Integer.parseInt(words[i + 7]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid capacity");
                    }
                    try{
                        page = Integer.parseInt(words[i + 6]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid page");
                    }
                    noteBook noteBook = new noteBook(words[i + 2], price, 0, capacity, Product.category.STATIONARY, words[i + 4], words[i + 5], page, "nothing");
                    Admin1.getAdmin1().getProducts().add(noteBook);
                    Admin1.getAdmin1().getStationaries().add(noteBook);
                    Collections.sort( Admin1.getAdmin1().getProducts());
                } else if (Objects.equals(words[i + 1], "food")) {
                    Double price = Double.parseDouble(words[i + 3]);
                    int capacity = Integer.parseInt(words[i + 6]);
                    try{
                        price = Double.parseDouble(words[i + 3]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid price");
                    }
                    try{
                        capacity = Integer.parseInt(words[i + 6]);
                    }catch (InputMismatchException e)
                    {
                        System.out.println("Invalid capacity");
                    }
                    Food food = new Food(words[i + 2], price, 0, capacity, Product.category.FOOD, words[i + 4], words[i + 5], "nothing");
                    Admin1.getAdmin1().getProducts().add(food);
                    Admin1.getAdmin1().getFoods().add(food);
                    Collections.sort( Admin1.getAdmin1().getProducts());
                }


            }

        }
    }

    public void removeAdmin(String order, String name) {

        String[] words = order.split("\\s");
        for (int i = 0; i < words.length; i++) {
            if (Objects.equals(words[i], "Remove")) {
                for (int r = 0; r < Admin1.getAdmin1().getProducts().size(); r++) {
                    if (Objects.equals(name, Admin1.getAdmin1().getProducts().get(r).getProductName())) {
                        Admin1.getAdmin1().getProducts().remove(r);
                    }
                }
            }
        }

    }

    public void changingInformationName(String order) {
        String[] words = order.split("\\s");
        for (int t = 0; t < words.length; t++) {
            if (Objects.equals(words[t], "Change")) {
                if (Objects.equals(words[t + 1], "name")) {
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
    public void discountCode(String order)
    {
        String[] words = order.split("\\s");
        for (int t = 0; t < words.length; t++) {
            if (Objects.equals(words[t], "Discount")) {
                if (Objects.equals(words[t + 1], "code")) {

                }
            }

        }
    }
}
