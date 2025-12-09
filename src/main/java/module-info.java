module org.example.codeclassplusjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.codeclassplusjava to javafx.fxml;
    exports org.example.codeclassplusjava;
}