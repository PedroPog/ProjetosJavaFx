package com.estudos.projetos.fxml;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.controlsfx.control.Notifications;

public class LoginController {
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField senhaField;


    public void entrar(){
        boolean emailValido = emailField.getText().equals("pedro@gmail.com");
        boolean senhaValido = senhaField.getText().equals("123456");
        if(emailValido && senhaValido){
            System.out.print("Sucesso!");
            Notifications.create()
                    .title("Login FXML")
                    .position(Pos.TOP_CENTER)
                    .text("Login efetuado com sucesso!").show();
        }else{
            System.out.print("Falha!");
            Notifications.create()
                    .title("Login FXML")
                    .position(Pos.TOP_CENTER)
                    .text("Ocorreu uma falha!").showError();
        }
    }
}
