module com.example.swingui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.swingui to javafx.fxml;
    exports com.example.swingui;
}