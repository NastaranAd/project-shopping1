package Controller;

import Exception.*;
import com.example.demoprojectphase22.Model.Admin1;
import com.example.demoprojectphase22.Model.Product;
import javafx.scene.control.Alert;

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

    public String filterByPrice(double max, double min) {
        String result = "";
        for (int k = 0; k < Admin1.getAdmin1().getProducts().size(); k++)
            if ((min <= Admin1.getAdmin1().getProducts().get(k).getProductPrice()) && (Admin1.getAdmin1().getProducts().get(k).getProductPrice() <= max)) {
                result +=Admin1.getAdmin1().getProducts().get(k).toString();
            }
        return result;
    }

    public String filterByCapacity() {
      String result = "";
        for (int k = 0; k < Admin1.getAdmin1().getProducts().size(); k++)
            if (Admin1.getAdmin1().getProducts().get(k).getCapacity() > 0) {
                result +=Admin1.getAdmin1().getProducts().get(k).toString();
            }
        return result;
    }

    public String filterByCompany(String company) {
        String result = "";
        for (int k = 0; k < Admin1.getAdmin1().getVehicles().size(); k++)
            if (Objects.equals(Admin1.getAdmin1().getVehicles().get(k).getCompany(), company)) {
                result +=Admin1.getAdmin1().getProducts().get(k).toString();
            }
        return result;
    }

    public String filterByWeight(double max, double min) {
        String result = "";
        for (int k = 0; k < Admin1.getAdmin1().getDigitals().size(); k++)
            if (min <= Admin1.getAdmin1().getDigitals().get(k).getWeight() && Admin1.getAdmin1().getDigitals().get(k).getWeight() <= max) {
                result += Admin1.getAdmin1().getDigitals().get(k).toString();

            }
        return result;
    }

    public String filterByDimension(double max, double min) {
        String result = "";
        for (int k = 0; k < Admin1.getAdmin1().getDigitals().size(); k++)
            if (min <= Admin1.getAdmin1().getDigitals().get(k).getDimension() && Admin1.getAdmin1().getDigitals().get(k).getDimension() <= max) {
                result += Admin1.getAdmin1().getDigitals().get(k).toString();
            }
       return result;
    }

    public String filterByColor(String color) {

        String result = "";
        for (int k = 0; k < Admin1.getAdmin1().getStationaries().get(k).getPens().size(); k++)
            if (Objects.equals(Admin1.getAdmin1().getStationaries().get(k).getPens().get(k).getColor(), color)) {
                result +=Admin1.getAdmin1().getStationaries().get(k).getPens().get(k).toString();
            }

        return result;
    }


    public String filterByCountry(String country) {
        String result = "";
        for (int b = 0; b < Admin1.getAdmin1().getStationaries().size(); b++) {
            if (Objects.equals(Admin1.getAdmin1().getStationaries().get(b).getCountry(), country)) {
                result += Admin1.getAdmin1().getStationaries().get(b).toString();
            }

        }
        return result;
    }

    public StringBuilder showInformation() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < Admin1.getAdmin1().getShoppers().size(); k++) {
            stringBuilder.append(Admin1.getAdmin1().getShoppers().get(k).toString());
        }
        return stringBuilder;
    }

    public StringBuilder changingEmail(String email1) throws InvalidEmail {
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
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("New Email");
                    alert.setContentText(email1);
                    alert.showAndWait();
                } else {
                    throw new InvalidEmail("Invalid email");
                }
            }
            stringBuilder1.append(Admin1.getAdmin1().getShoppers().get(k).getEmail());
        }
        return stringBuilder1;
    }

    public StringBuilder changingPhoneNumber(String phoneNumber1) throws InvalidPhoneNumber {
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
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("New Email");
                    alert.setContentText(phoneNumber1);
                    alert.showAndWait();
                } else {
                    throw new InvalidPhoneNumber("Invalid phoneNumber");
                }
            }
            stringBuilder1.append(Admin1.getAdmin1().getShoppers().get(k).getPhoneNumber());
        }
        return stringBuilder1;
    }

    public StringBuilder changingPassword(String password1) throws InvalidPassword {
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
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("New Email");
                    alert.setContentText(password1);
                    alert.showAndWait();
                } else {
                    throw new InvalidPassword("Invalid password");
                }
            }
            stringBuilder1.append(Admin1.getAdmin1().getShoppers().get(k).getPassword());
        }
        return stringBuilder1;
    }

    public String searchByName(String name1) {
        String result = "";
        for (int l = 0; l < Admin1.getAdmin1().getProducts().size(); l++) {
            if (Objects.equals(Admin1.getAdmin1().getProducts().get(l).getProductName(), name1)) {
               result+= Admin1.getAdmin1().getProducts().get(l).toString();
            }
        }
        return result;
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

    public StringBuilder showDiscountCode(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int t = 0; t < Admin1.getAdmin1().getShoppers().get(i).getDiscounts().size(); t++) {
            //stringBuilder.append(Admin1.getAdmin1().getShoppers().get(i).getUserName()+"\n");
            stringBuilder.append(Admin1.getAdmin1().getShoppers().get(i).getDiscounts().get(t).getCode() + "\n");
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }
}

