package com.estudos.projetos;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class Contador extends Application {

    private int contador =0;

    private void atualizarLabelNumero(Label label){
        label.setText(Integer.toString(contador));
        label.getStyleClass().remove("verde");
        label.getStyleClass().remove("vermelho");

        if(contador>0){
            label.getStyleClass().add("verde");
        }else if(contador<0){
            label.getStyleClass().add("vermelho");
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label lblTitle = new Label("Contador");
        Label lblNumero = new Label("0");
        Button btnIncremento = new Button("+");
        Button btnDecremento = new Button("-");
        lblTitle.getStyleClass().add("title");
        lblNumero.getStyleClass().add("numero");
        btnDecremento.getStyleClass().add("btn");
        btnIncremento.getStyleClass().add("btn");
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        btnIncremento.setOnAction(e->{
            contador++;
            atualizarLabelNumero(lblNumero);
        });
        btnDecremento.setOnAction(e->{
            contador--;
            atualizarLabelNumero(lblNumero);
        });

        HBox boxBotoes = new HBox();
        boxBotoes.getChildren().add(btnDecremento);
        boxBotoes.getChildren().add(btnIncremento);
        boxBotoes.setSpacing(10);
        boxBotoes.setAlignment(Pos.CENTER);

        VBox boxPrincipal = new VBox();
        boxPrincipal.getStyleClass().add("conteudo");
        boxPrincipal.setAlignment(Pos.CENTER);
        boxPrincipal.setSpacing(10);
        boxPrincipal.getChildren().add(lblTitle);
        boxPrincipal.getChildren().add(lblNumero);
        boxPrincipal.getChildren().add(boxBotoes);

        String arquivoCss = getClass()
                .getResource("/styles/Contador.css").toExternalForm();
        Scene scene = new Scene(boxPrincipal,dimension.width/2,dimension.height/2);
        scene.getStylesheets().add(arquivoCss);
        scene.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
