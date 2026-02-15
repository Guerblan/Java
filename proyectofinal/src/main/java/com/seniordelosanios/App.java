package com.seniordelosanios;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        /*
         * aquí en el root estamos cargando la clase y el resource,que son la ventana y
         * todo lo que se ve
         */
        Parent root = FXMLLoader
                .load(getClass().getResource("/com/seniordelosanios/recursos/vista/VistaPrincipal.fxml"));
        primaryStage.setTitle("Registro de Habitantes de Endor");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
