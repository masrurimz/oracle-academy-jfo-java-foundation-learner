module com.campus_map {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.campus_map to javafx.fxml;
    exports com.campus_map;
}
