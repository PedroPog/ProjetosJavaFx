package com.estudos.projetos.layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

import java.util.ArrayList;
import java.util.List;

public class TesteTilePane extends TilePane {
    public TesteTilePane() {
        List<Quadrado> quadrados = new ArrayList<>();

        for(int i=1;i<10;i++){
            quadrados.add(new Quadrado(100));
        }
        setVgap(10);
        setHgap(10);
        setPadding(new Insets(20));
        setOrientation(Orientation.HORIZONTAL);
        setTileAlignment(Pos.BOTTOM_RIGHT);
        getChildren().addAll(quadrados);
    }
}
