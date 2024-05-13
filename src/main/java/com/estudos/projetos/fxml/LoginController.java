package com.estudos.projetos.fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField senhaField;


    public void entrar(){
        if(emailField.getText().isEmpty()){
            System.out.println("Email vazio...");
        }
        else if(senhaField.getText().isEmpty()){
            System.out.println("Senha Vazia...");
        }
        else{
            System.out.println("Entrando..");
        }
    }
}
