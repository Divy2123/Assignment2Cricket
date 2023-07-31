module com.example.assignment2cricket {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.assignment2cricket to javafx.fxml;
    exports com.example.assignment2cricket;
    exports com.myapp.controller;
    opens com.myapp.controller to javafx.fxml;
    exports com.myapp.model;
    opens com.myapp.model to javafx.fxml;
    exports com.myapp;
    opens com.myapp to javafx.fxml;
}

