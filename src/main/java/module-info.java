module com.example.javafxdatabaseap {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxdatabaseap to javafx.fxml;
    exports com.example.javafxdatabaseap;
}