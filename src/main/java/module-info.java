module com.example.repaso_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.repaso_fx to javafx.fxml;
    exports com.example.repaso_fx;
}