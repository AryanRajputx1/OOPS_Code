module com.example.oops2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oops2 to javafx.fxml;
    exports com.example.oops2;
}