package com.estudos.projetos.calculadora;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class BarraTitulo extends HBox {
    private Button btnExit = new Button();

    public BarraTitulo() {
        getStyleClass().add("barra-titulo");

        btnExit.setOnAction(e->System.exit(0));

        setOnMouseEntered(e->btnExit.setText("x"));
        setOnMouseExited(e->btnExit.setText(""));

        btnExit.getStyleClass().add("botao-fechar");
        getChildren().add(btnExit);
    }
}
