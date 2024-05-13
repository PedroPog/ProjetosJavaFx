package com.estudos.projetos;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Wizard extends Application {

    private Stage janela;
    private Scene passo1;
    private Scene passo2;
    private Scene passo3;

    private void criarPasso1(){
        Button btnNext = new Button("Next");

        btnNext.setOnAction(e->{
            janela.setScene(passo2);
            janela.setTitle("Wizard - Passo 2");
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(btnNext);
        passo1 = new Scene(box,400,400);
    }
    private void criarPasso2(){
        Button btnNext = new Button("Next");
        Button btnBack = new Button("Back");

        btnNext.setOnAction(e->{
            janela.setScene(passo3);
            janela.setTitle("Wizard - Passo 3");
        });
        btnBack.setOnAction(e->{
            janela.setScene(passo1);
            janela.setTitle("Wizard");
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(btnBack);
        box.getChildren().add(btnNext);

        passo2 = new Scene(box,400,400);
    }

    private void criarPasso3(){
        Button btnEnd = new Button("End");
        Button btnBack = new Button("Back");

        btnEnd.setOnAction(e->{
            System.exit(0);
        });
        btnBack.setOnAction(e->{
            janela.setScene(passo2);
            janela.setTitle("Wizard - Passo 2");
        });

        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(btnBack);
        box.getChildren().add(btnEnd);

        janela.setTitle("Wizard - Passo 3");
        passo3 = new Scene(box,400,400);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        janela = primaryStage;
        criarPasso1();
        criarPasso2();
        criarPasso3();

        janela.setScene(passo1);
        janela.setTitle("Wizard");
        janela.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
