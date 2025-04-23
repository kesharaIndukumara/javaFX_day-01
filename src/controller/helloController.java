package controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import model.user;

import java.net.URL;
import java.util.ResourceBundle;

public class helloController implements Initializable {
    public Label lblTitle;
    public Button btnLogin;
    public TextField txtUsername;
    public PasswordField txtPassword;

    final String username = "kavindu@gmail.com";
    final String password = "123@kesh";

    public Label lblMessage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void btnLoginAction(ActionEvent actionEvent) {
        String inputUsername = txtUsername.getText();
        String inputPassword = txtPassword.getText();

        if(username.equalsIgnoreCase(inputUsername) && password.equals(inputPassword)){
            //lblMessage.setText("Correct Password...");
            new Alert(Alert.AlertType.INFORMATION,"Welcome!").show();
        }else{
            //lblMessage.setText("Incorrect username or password..");
            new Alert(Alert.AlertType.ERROR,"Incorrect username or Password\nTry Again!!").show();
        }

    }
}
