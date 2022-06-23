module com.devmate.form {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.devmate.form to javafx.fxml;
    exports com.devmate.form;
}