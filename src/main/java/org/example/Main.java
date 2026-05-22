package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Botón para mostrar texto texto");
        Button boton = new Button("Pulsar aquí");
        boton.setOnAction(e -> System.out.println("Has pulsado el boton.")); //Acción que hace el botón al pulsarlo

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().add(boton);
        Scene scene = new Scene(layout,100,100);
        stage.setScene(scene);
        stage.show();
    }
}
