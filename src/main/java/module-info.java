module com.example.therandomgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.therandomgame to javafx.fxml;
    exports com.example.therandomgame;
}