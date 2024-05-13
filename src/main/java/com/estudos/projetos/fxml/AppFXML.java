package com.estudos.projetos.fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.net.URL;

public class AppFXML extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        String arquivoCSS = getClass().getResource("/styles/Login.css").toExternalForm();
        URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
        GridPane raiz = FXMLLoader.load(arquivoFXML);

        Scene scene = new Scene(raiz,400,300);
        scene.getStylesheets().add(arquivoCSS);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Tela de Login");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
