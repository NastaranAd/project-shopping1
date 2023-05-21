package Model;

import java.time.LocalTime;
import java.util.Random;

public class Discount {
    private String code;
    private double percent;
    private int discountCapacity;
    private LocalTime time;

    public Discount(double percent, int discountCapacity, LocalTime time) {
        this.time = time;
        this.discountCapacity = discountCapacity;
        this.percent = percent;
        this.code=codeMaker();
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
    public String toString() {
        return "discount code : " + code + "\n" +
                "percent : " + percent;
    }

    public String codeMaker() {
        StringBuilder makeCode = new StringBuilder();
        Random random = new Random();
        makeCode.append("N");
        makeCode.append("a");
        makeCode.append("#");
        makeCode.append(random.nextInt());
        String code = makeCode.toString();
        return code;
    }
}
