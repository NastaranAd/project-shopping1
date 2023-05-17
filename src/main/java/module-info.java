module com.example.demoprojectphase22 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoprojectphase22 to javafx.fxml;
    exports com.example.demoprojectphase22;
}