module com.estudos.contador {
    requires javafx.controls;
    requires java.desktop;
    requires javafx.fxml;
    requires org.controlsfx.controls;

    opens com.estudos.projetos;
    opens com.estudos.projetos.layout;
    opens com.estudos.projetos.fxml;
    opens com.estudos.projetos.calculadora;
}