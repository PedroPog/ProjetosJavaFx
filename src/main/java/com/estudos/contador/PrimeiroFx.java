package com.estudos.contador;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFx extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Button btnA = new Button("Print A");
        Button btnB = new Button("Print B");
        Button btnC = new Button("Sair");

        btnA.setOnAction(e->System.out.print("A"));
        btnB.setOnAction(e->System.out.print("B"));
        btnC.setOnAction(e->System.exit(0));

        VBox box = new VBox();
        box.setSpacing(10);
        box.setAlignment(Pos.CENTER);
        box.getChildren().add(btnA);
        box.getChildren().add(btnB);
        box.getChildren().add(btnC);
        Scene scene = new Scene(box,200,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
