module com.ngh.quizappv1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.ngh.quizappv1 to javafx.fxml;
    exports com.ngh.quizappv1;
}
