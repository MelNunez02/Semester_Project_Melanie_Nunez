module com.semeter_project_melanie_nunez.semester_project_melanie_nunez {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.semeter_project_melanie_nunez.semester_project_melanie_nunez to javafx.fxml;
    exports com.semeter_project_melanie_nunez.semester_project_melanie_nunez;
}