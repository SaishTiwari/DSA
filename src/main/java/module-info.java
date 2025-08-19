module com.tiwarisaish.dsa_learning {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tiwarisaish.dsa_learning to javafx.fxml;
    exports com.tiwarisaish.dsa_learning;
    exports com.tiwarisaish.dsa_learning.sorting;
    opens com.tiwarisaish.dsa_learning.sorting to javafx.fxml;
}