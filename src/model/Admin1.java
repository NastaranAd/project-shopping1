package model;

import java.util.ArrayList;

public class Admin1 {
    final private ArrayList<Shopper> shoppers = new ArrayList<>();
    final private ArrayList<Request> signInRequests = new ArrayList<>();
    final private ArrayList<Request> requestsMoney = new ArrayList<>();
    final private ArrayList<Vehicle> vehicles = new ArrayList<>();
    final private ArrayList<Digital>digitals= new ArrayList<>();
    final private ArrayList<Food>foods=new ArrayList<>();
    final private ArrayList<Factor> factors = new ArrayList<>();
    final private ArrayList<Opinion> opinions = new ArrayList<>();
    final private ArrayList<Stationary> stationaries = new ArrayList<>();
    final private ArrayList<Basket> baskets = new ArrayList<>();

    public ArrayList<Shopper> getShoppers() {
        return shoppers;
    }

    public ArrayList<Request> getSignInRequests() {
        return signInRequests;
    }

    public ArrayList<Request> getRequestsMoney() {
        return requestsMoney;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public ArrayList<Stationary> getStationaries() {
        return stationaries;
    }
    public ArrayList<Digital> getDigitals() {
        return digitals;
    }
    public ArrayList<Food> getFoods() {
        return foods;
    }

    final private ArrayList<Basket1>basket1s= new ArrayList<>();
    final private ArrayList<Request200>request200s=new ArrayList<>();
    public ArrayList<Basket> getBaskets() {
        return baskets;
    }
    public ArrayList<Opinion> getOpinion() {
        return opinions;
    }

    private static Admin1 admin1;
    final private ArrayList<Product> products = new ArrayList<>();

    final public ArrayList<Product> getProducts() {
        return products;
    }
    final private ArrayList<Request1>request1s= new ArrayList<>();

    public ArrayList<Request1> getRequest1s() {
        return request1s;
    }

    public ArrayList<Factor> getFactors() {
        return factors;
    }
    public ArrayList<Request200> getRequest200() {
        return request200s;
    }
    public ArrayList<Basket1> getBasket1()
    {
        return basket1s;
    }

    private String password;
    private String userName;

    public Admin1(String password, String userName) {
        this.password = password;
        this.userName = userName;
    }

    public static Admin1 getAdmin1(String userName, String password) {
        if (admin1 == null) {
            admin1 = new Admin1(userName, password);
        }
        return admin1;
    }

    public static Admin1 getAdmin1() {
        return admin1;
    }

}
