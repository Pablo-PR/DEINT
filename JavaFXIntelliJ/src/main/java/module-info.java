module com.example.javafxintellij {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxintellij to javafx.fxml;
    exports com.example.javafxintellij;
}