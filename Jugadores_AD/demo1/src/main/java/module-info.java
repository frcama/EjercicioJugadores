module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.demo1 to javafx.fxml;
    exports com.example.demo1;
}