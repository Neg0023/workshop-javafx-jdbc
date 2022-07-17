module com.example.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.application to javafx.fxml;
    exports com.example.application;
    opens com.example.model.entities;
    opens com.example.model.services;
}