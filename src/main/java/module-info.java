module org.example.flyweight {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens org.example.flyweight to javafx.fxml;
    exports org.example.flyweight;
    exports org.example.flyweight.game;
    opens org.example.flyweight.game to javafx.fxml;
    exports org.example.flyweight.controller;
    opens org.example.flyweight.controller to javafx.fxml;
}