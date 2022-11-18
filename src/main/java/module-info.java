module com.example.cypherjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cypherjavafx to javafx.fxml;
    exports com.example.cypherjavafx;
}