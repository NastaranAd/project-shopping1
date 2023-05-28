package Controller;

import Exception.*;
import com.example.demoprojectphase22.Model.Admin1;
import com.example.demoprojectphase22.Model.Product;
import javafx.scene.control.Alert;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Shopper {
    public String Showing() {
        String result ="";
        for (int y = 0; y < Admin1.getAdmin1().getProducts().size(); y++) {
            result+=(Admin1.getAdmin1().getProducts().get(y).toString()+"\n"+"\n");
        }
        return result;
    }

    public String filterByCategory(Product.category kind) {
        String result = "";
        for (int k = 0; k < Admin1.getAdmin1().getProducts().size(); k++) {
            if ((kind.compareTo(Admin1.getAdmin1().getProducts().get(k).product) == 0)) {
                result+=Admin1.getAdmin1().getProducts().get(k).toString();
            }

        }
        return result;
    }

    public String filterByPrice(double max, double min) {
        String result = "";
        for (int k = 0; k < Admin1.getAdmin1().getProducts().size(); k++)
            if ((min <= Admin1.getAdmin1().getProducts().get(k).getProductPrice()) && (Admin1.getAdmin1().getProducts().get(k).getProductPrice() <= max)) {
                result +=(Admin1.getAdmin1().getProducts().get(k).toString()+"\n"+"\n");
            }
        return result;
    }

    public String filterByCapacity() {
      String result = "";
        for (int k = 0; k < Admin1.getAdmin1().getProducts().size(); k++)
            if (Admin1.getAdmin1().getProducts().get(k).getCapacity() > 0) {
                result +=(Admin1.getAdmin1().getProducts().get(k).toString()+"\n"+"\n");
            }
        return result;
    }

    public String filterByCompany(String company) {
        String result = "";
        for (int k = 0; k < Admin1.getAdmin1().getVehicles().size(); k++)
            if (Objects.equals(Admin1.getAdmin1().getVehicles().get(k).getCompany(), company)) {
                result +=(Admin1.getAdmin1().getVehicles().get(k).toString()+"\n"+"\n");
            }
        return result;
    }

    public String filterByWeight(double max, double min) {
        String result = "";
        for (int k = 0; k < Admin1.getAdmin1().getDigitals().size(); k++)
            if (min <= Admin1.getAdmin1().getDigitals().get(k).getWeight() && Admin1.getAdmin1().getDigitals().get(k).getWeight() <= max) {
                result += (Admin1.getAdmin1().getDigitals().get(k).toString()+"\n"+"\n");

            }
        return result;
    }

    public String filterByDimension(double max, double min) {
        String result = "";
        for (int k = 0; k < Admin1.getAdmin1().getDigitals().size(); k++)
            if (min <= Admin1.getAdmin1().getDigitals().get(k).getDimension() && Admin1.getAdmin1().getDigitals().get(k).getDimension() <= max) {
                result += (Admin1.getAdmin1().getDigitals().get(k).toString()+"\n"+"\n");
            }
       return result;
    }

    public String filterByColor(String color) {

        String result = "";
        for (int k = 0; k < Admin1.getAdmin1().getStationaries().get(k).getPens().size(); k++)
            if (Objects.equals(Admin1.getAdmin1().getStationaries().get(k).getPens().get(k).getColor(), color)) {
                result +=(Admin1.getAdmin1().getStationaries().get(k).getPens().get(k).toString()+"\n"+"\n");
            }

        return result;
    }


    public String filterByCountry(String country) {
        String result = "";
        for (int b = 0; b < Admin1.getAdmin1().getStationaries().size(); b++) {
            if (Objects.equals(Admin1.getAdmin1().getStationaries().get(b).getCountry(), country)) {
                result += (Admin1.getAdmin1().getStationaries().get(b).toString()+"\n"+"\n");
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

    public void changingPhoneNumber(String phoneNumber1) throws InvalidPhoneNumber {

        for (int k = 0; k < Admin1.getAdmin1().getShoppers().size(); k++) {
            boolean helper = false;
            while (helper == false) {
                Pattern pattern = Pattern.compile("^09\\d{9}$");
                Matcher matcher = pattern.matcher(phoneNumber1);
                boolean found = matcher.find();
                if (found == true) {
                    helper = true;
                    Admin1.getAdmin1().getShoppers().get(k).setPhoneNumber(phoneNumber1);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("New Phone Number");
                    alert.setContentText(phoneNumber1);
                    alert.showAndWait();
                } else {
                    throw new InvalidPhoneNumber("Invalid phoneNumber");
                }
            }
        }
    }

    public void changingPassword(String password1) throws InvalidPassword {
        for (int k = 0; k < Admin1.getAdmin1().getShoppers().size(); k++) {
            boolean helper = false;
            while (helper == false) {
                Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%&]).{6,20}$");
                Matcher matcher = pattern.matcher(password1);
                boolean found = matcher.find();
                if (found == true) {
                    helper = true;
                    Admin1.getAdmin1().getShoppers().get(k).setPassword(password1);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("New Password");
                    alert.setContentText(password1);
                    alert.showAndWait();
                } else {
                    throw new InvalidPassword("Invalid password");
                }
            }
        }
    }

    public String searchByName(String name1) {
        String result = "";
        for (int l = 0; l < Admin1.getAdmin1().getProducts().size(); l++) {
            if (Objects.equals(Admin1.getAdmin1().getProducts().get(l).getProductName(), name1)) {
               result+= (Admin1.getAdmin1().getProducts().get(l).toString()+"\n"+"\n");
            }
        }
        return result;
    }

    public String showFactors(int k) {
        String result = "";
        for (int h = 0; h < Admin1.getAdmin1().getShoppers().get(k).getFactors().size(); h++) {
            result+=Admin1.getAdmin1().getShoppers().get(k).getFactors().get(h).getProductName() +"    "+Admin1.getAdmin1().getShoppers().get(k).getFactors().get(h).getAmountPaid() + "\n";
        }
        return result;
    }

    public String showBaskest(int i) {
        String result = "";
        for (int t = 0; t < Admin1.getAdmin1().getShoppers().get(i).getBaskets().size(); t++) {
           result+=(Admin1.getAdmin1().getBasket1().get(t).getProductName() + "\n");
        }
        return result;
    }

    public String showDiscountCode(int i) {
        String result = "";
        for (int t = 0; t < Admin1.getAdmin1().getShoppers().get(i).getDiscounts().size(); t++) {
           result+=(Admin1.getAdmin1().getShoppers().get(i).getDiscounts().get(t).getCode() + "\n"+"\n");
        }
        return result;
    }
}

