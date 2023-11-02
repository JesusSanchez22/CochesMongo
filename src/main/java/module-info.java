module com.example.cochesmongo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires mongodb.driver;

    opens com.example.cochesmongo to javafx.fxml;
    exports com.example.cochesmongo;
}