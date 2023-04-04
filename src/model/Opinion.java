package model;

import java.util.ArrayList;

public class Opinion {
    private int index;
    private String commentingUser;
    private String commentText;
    private String commentStatus;
    private double score;
    private String productName;
    public double getScore() {
        return this.score;
    }

    public String getCommentText() {
        return this.commentText;
    }
    public String getProductName1000() {
        return this.productName;
    }
    public double setscore(double score200)
    {
        return this.score=this.score+score200;
    }

    public Opinion(String productName,String commentText,int score) {
        this.score = score;
        this.productName=productName;
        this.commentText=commentText;
    }
    public Opinion(int index)
    {
        this.index=index;
    }
    private ArrayList<Product> products = new ArrayList<>();

    public ArrayList<Product> getProducts() {
        return products;
    }
    public int getIndex()
    {
        return this.index;
    }

}