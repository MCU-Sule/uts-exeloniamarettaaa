module com.exel.uts_1972023 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.exel.uts_1972023 to javafx.fxml;
    exports com.exel.uts_1972023;
}