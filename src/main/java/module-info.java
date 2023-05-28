    module com.example.demoprojectphase {
    requires javafx.controls;
    requires javafx.fxml;
    //requires java.base;

   opens com.example.demoprojectphase22.Model to javafx.fxml;
    opens com.example.demoprojectphase22 to javafx.fxml;
    exports com.example.demoprojectphase22;
    //opens com.example.demoprojectphase22.Model.Product to javafx.fxml;

}