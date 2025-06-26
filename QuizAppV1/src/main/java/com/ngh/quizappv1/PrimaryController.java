package com.ngh.quizappv1;

import com.ngh.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class PrimaryController {
    public void handleQuestionManagement(ActionEvent event) throws IOException{
        App.setRoot("questions");
    }
    public void handlePractice(ActionEvent event){
        MyAlert.getInstance().showMsg("Coming soon Huydz...");
    }
}
