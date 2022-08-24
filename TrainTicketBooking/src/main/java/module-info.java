module com.example.trainticketbooking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trainticketbooking to javafx.fxml;
    exports com.example.trainticketbooking;
}