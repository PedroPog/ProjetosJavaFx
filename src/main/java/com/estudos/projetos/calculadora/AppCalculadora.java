package com.estudos.projetos.calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AppCalculadora extends Application {
    private double posX = 0;
    private double posY = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Font.loadFont(getClass().getResource("/fonts/Roboto-Thin.ttf").toExternalForm(),10);
        String css = getClass().getResource("/styles/Calculadora.css").toExternalForm();

        Scene scene = new Scene(new Calculadora(),230,320);
        scene.setFill(Color.TRANSPARENT);
        scene.getStylesheets().add(css);

        scene.setOnMousePressed(e->{
            posX = primaryStage.getX() - e.getSceneX();
            posY = primaryStage.getY() - e.getSceneY();
        });
        scene.setOnMouseDragged(e->{
            primaryStage.setX(e.getSceneX()+posX);
            primaryStage.setY(e.getSceneY()+posY);
        });
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
