package model;

public class Opinion {
    private String commentingUser;
    private String commentText;
    private String commentStatus;
    private double score;
    private String productName;
    public double getScore() {
        return this.score;
    }

    public String getCommentingUser() {
        return this.commentingUser;
    }
    public String getProductName1000() {
        return this.productName;
    }
    public double setscore(double score200)
    {
        return this.score=this.score+score200;
    }

    public Opinion(String commentingUser,String productName, String commentText, int score) {
        this.score = score;
        this.commentText = commentText;
        this.productName=productName;
        this.commentingUser=commentingUser;
    }
}