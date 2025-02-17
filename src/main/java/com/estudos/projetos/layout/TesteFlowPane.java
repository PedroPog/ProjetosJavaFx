package com.estudos.projetos.layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {
    public TesteFlowPane() {
        Quadrado q1 = new Quadrado();
        Quadrado q2 = new Quadrado();
        Quadrado q3 = new Quadrado();
        Quadrado q4 = new Quadrado();
        Quadrado q5 = new Quadrado();

        setHgap(10);
        setVgap(10);
        setPadding(new Insets(30,10,30,25));
        setOrientation(Orientation.VERTICAL);
        setAlignment(Pos.CENTER);
        getChildren().addAll(q1,q2,q3,q4,q5);
    }
}
