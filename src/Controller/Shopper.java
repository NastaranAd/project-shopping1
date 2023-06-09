package Controller;

import Model.Admin1;
import Model.Product;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shopper {
    public StringBuilder Showing() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int y = 0; y < Admin1.getAdmin1().getProducts().size(); y++) {
            stringBuilder.append(Admin1.getAdmin1().getProducts().get(y).toString());
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }

    public StringBuilder filterByCategory(Product.category kind) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < Admin1.getAdmin1().getProducts().size(); k++) {
            if ((kind.compareTo(Admin1.getAdmin1().getProducts().get(k).product) == 0)) {
                stringBuilder.append((Admin1.getAdmin1().getProducts().get(k).toString()) + "\n");
            }

        }
        return stringBuilder;
    }

    public StringBuilder filterByPrice(long max, long min) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < Admin1.getAdmin1().getProducts().size(); k++)
            if ((min <= Admin1.getAdmin1().getProducts().get(k).getProductPrice()) && (Admin1.getAdmin1().getProducts().get(k).getProductPrice() <= max)) {
                stringBuilder.append(Admin1.getAdmin1().getProducts().get(k).toString() + "\n");
                stringBuilder.append("\n");
            }
        return stringBuilder;
    }

    public StringBuilder filterByCapacity() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < Admin1.getAdmin1().getProducts().size(); k++)
            if (Admin1.getAdmin1().getProducts().get(k).getCapacity() > 0) {
                stringBuilder.append(Admin1.getAdmin1().getProducts().get(k).toString() + "\n");
                stringBuilder.append("\n");
            }
        return stringBuilder;
    }

    public StringBuilder filterByCompany(String company) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < Admin1.getAdmin1().getVehicles().size(); k++)
            if (Objects.equals(Admin1.getAdmin1().getVehicles().get(k).getCompany(), company)) {
                stringBuilder.append(Admin1.getAdmin1().getProducts().get(k).toString() + "\n");
                stringBuilder.append("\n");
            }
        return stringBuilder;
    }

    public StringBuilder filterByWeight(double max, double min) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < Admin1.getAdmin1().getDigitals().size(); k++)
            if (min <= Admin1.getAdmin1().getDigitals().get(k).getWeight() && Admin1.getAdmin1().getDigitals().get(k).getWeight() <= max) {
                stringBuilder.append(Admin1.getAdmin1().getDigitals().toString() + "\n");
                stringBuilder.append("\n");
            }
        return stringBuilder;
    }

    public StringBuilder filterByDimension(double max, double min) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < Admin1.getAdmin1().getDigitals().size(); k++)
            if (min <= Admin1.getAdmin1().getDigitals().get(k).getDimension() && Admin1.getAdmin1().getDigitals().get(k).getDimension() <= max) {
                stringBuilder.append(Admin1.getAdmin1().getDigitals().toString() + "\n");
                stringBuilder.append("\n");
            }
        return stringBuilder;
    }

    public StringBuilder filterByColor(String color) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < Admin1.getAdmin1().getStationaries().get(k).getPens().size(); k++)
            if (Objects.equals(Admin1.getAdmin1().getStationaries().get(k).getPens().get(k).getColor(), color)) {
                    stringBuilder.append(Admin1.getAdmin1().getStationaries().get(k).getPens().get(k).toString() + "\n");
                    stringBuilder.append("\n");
                }

        return stringBuilder;
    }


    public StringBuilder filterByCountry(String country) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int b = 0; b < Admin1.getAdmin1().getStationaries().size(); b++)
            if (Objects.equals(Admin1.getAdmin1().getStationaries().get(b).getCountry(), country)) {
                stringBuilder.append((b + 1) + "." + Admin1.getAdmin1().getStationaries().get(b).toString() + "\n");
                stringBuilder.append("\n");
            }
        return stringBuilder;
    }

    public StringBuilder showInformation() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < Admin1.getAdmin1().getShoppers().size(); k++) {
            stringBuilder.append(Admin1.getAdmin1().getShoppers().get(k).toString());
        }
        return stringBuilder;
    }

    public StringBuilder changingEmail(String email1) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int k = 0; k < Admin1.getAdmin1().getShoppers().size(); k++) {
            stringBuilder.append(Admin1.getAdmin1().getShoppers().get(k).toString());
            boolean helper = false;
            while (helper == false) {
                Pattern pattern = Pattern.compile("^(.+)@(gmail|yahoo)\\.com$");
                Matcher matcher = pattern.matcher(email1);
                boolean found = matcher.find();
                if (found == true) {
                    helper = true;
                    Admin1.getAdmin1().getShoppers().get(k).setEmail(email1);
                }
            }
            stringBuilder1.append(Admin1.getAdmin1().getShoppers().get(k).getEmail());
        }
        return stringBuilder1;
    }

    public StringBuilder changingPhoneNumber(String phoneNumber1) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int k = 0; k < Admin1.getAdmin1().getShoppers().size(); k++) {
            stringBuilder.append(Admin1.getAdmin1().getShoppers().get(k).toString());
            boolean helper = false;
            while (helper == false) {
                Pattern pattern = Pattern.compile("^09\\d{9}$");
                Matcher matcher = pattern.matcher(phoneNumber1);
                boolean found = matcher.find();
                if (found == true) {
                    helper = true;
                    Admin1.getAdmin1().getShoppers().get(k).setPhoneNumber(phoneNumber1);
                }
            }
            stringBuilder1.append(Admin1.getAdmin1().getShoppers().get(k).getPhoneNumber());
        }
        return stringBuilder1;
    }

    public StringBuilder changingPassword(String password1) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int k = 0; k < Admin1.getAdmin1().getShoppers().size(); k++) {
            stringBuilder.append(Admin1.getAdmin1().getShoppers().get(k).toString());
            boolean helper = false;
            while (helper == false) {
                Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&]).{6,20}$");
                Matcher matcher = pattern.matcher(password1);
                boolean found = matcher.find();
                if (found == true) {
                    helper = true;
                    Admin1.getAdmin1().getShoppers().get(k).setPassword(password1);
                }
            }
            stringBuilder1.append(Admin1.getAdmin1().getShoppers().get(k).getPassword());
        }
        return stringBuilder1;
    }

    public StringBuilder searchByName(String name1) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int l = 0; l < Admin1.getAdmin1().getProducts().size(); l++) {
            if (Objects.equals(Admin1.getAdmin1().getProducts().get(l).getProductName(), name1)) {
                stringBuilder.append(Admin1.getAdmin1().getProducts().get(l).toString());
                stringBuilder.append("\n");
            }
        }
        return stringBuilder;
    }

    public StringBuilder showFactors(int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int h = 0; h < Admin1.getAdmin1().getShoppers().get(k).getFactors().size(); h++) {
            stringBuilder.append(Admin1.getAdmin1().getShoppers().get(k).getFactors().get(h).getProductName() + "\n");
            stringBuilder.append(Admin1.getAdmin1().getShoppers().get(k).getFactors().get(h).getAmountPaid() + "\n");
            stringBuilder.append(Admin1.getAdmin1().getShoppers().get(k).getFactors().get(h).getDate() + "\n");
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }

    public StringBuilder showBaskest(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int t = 0; t < Admin1.getAdmin1().getShoppers().get(i).getBaskets().size(); t++) {
            stringBuilder.append(Admin1.getAdmin1().getBasket1().get(t).getProductName() + "\n");
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }

}

