package Model;

public class Discount
{
    private String code;
    private double percent;
    public Discount(String code,double percent)
    {
        this.code=code;
        this.percent=percent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
    @Override
    public String toString()
    {
        return "discount code : "+ code+"\n"+
                "percent : "+percent;
    }
}
