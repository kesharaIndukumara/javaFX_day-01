package controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class helloController implements Initializable {
    public Label lblTitle;
    String title = "JavaFX_Day-01";


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblTitle.setText(title);
    }

    public void btnLoginAction(ActionEvent actionEvent) {
        lblTitle.setText("Hi kesh");
    }
}
