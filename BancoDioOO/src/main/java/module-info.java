module com.bancodio.bancodiooo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bancodio.bancodiooo to javafx.fxml;
    exports com.bancodio.bancodiooo;
}