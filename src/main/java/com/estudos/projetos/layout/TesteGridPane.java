package com.estudos.projetos.layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane {
    public TesteGridPane() {
        Caixa c1 = new Caixa().comTexto("1");
        Caixa c2 = new Caixa().comTexto("2");
        Caixa c3 = new Caixa().comTexto("3");
        Caixa c4 = new Caixa().comTexto("4");
        Caixa c5 = new Caixa().comTexto("5");
        Caixa c6 = new Caixa().comTexto("6");

        setGridLinesVisible(true);
        getColumnConstraints().addAll(cc(),cc(),cc(),fcc(),cc(),cc());
        getRowConstraints().addAll(rc(),rc(),rc(),frc(),rc(),rc());

        setVgap(5);
        setHgap(5);

        add(c1,0,0,2,2);
        add(c2,2,2,2,2);
        add(c3,5,2,1,4);
        add(c4,4,1);
        add(c5,0,5,2,1);
        add(c6,4,3);
    }

    private ColumnConstraints cc(){
        ColumnConstraints cc = new ColumnConstraints();
        cc.setPercentWidth(20);
        cc.setFillWidth(true);
        return cc;
    }
    private ColumnConstraints fcc(){
        ColumnConstraints cc = new ColumnConstraints();
        cc.setMinWidth(20);
        cc.setMaxWidth(50);
        cc.setFillWidth(true);
        return cc;
    }
    private RowConstraints rc(){
        RowConstraints rc = new RowConstraints();
        rc.setPercentHeight(20);
        rc.setFillHeight(true);
        return rc;
    }
    private RowConstraints frc(){
        RowConstraints rc = new RowConstraints();
        rc.setMinHeight(20);
        rc.setMaxHeight(20);
        rc.setFillHeight(true);
        return rc;
    }
}
