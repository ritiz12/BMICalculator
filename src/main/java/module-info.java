module com.example.bmicalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.bmicalculator to javafx.fxml;
    exports com.example.bmicalculator;


}