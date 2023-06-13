module com.example.cloudbot {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.cloudbot to javafx.fxml;
    exports com.example.cloudbot;
}