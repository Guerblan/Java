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
         * La clase Parent es una clase de la que vienen todas las demás clases.La llamamos root y con ella apuntamos 
         * al VistaPrincipal.fxml
         * 
         * Es un clase vacía,un nodo vacío sin información.En este nodo mediante la biblioteca fxml loader  cargaremos 
         * la clase y los recursos de la ruta que le demos.En este caso VistPrincipal.fxml
         * 
         */
        Parent root = FXMLLoader
                .load(getClass().getResource("/com/seniordelosanios/recursos/vista/VistaPrincipal.fxml"));
                //"Cargamos " una escena (importante usar esa palabra y no otra) y le damos unos valores
        primaryStage.setTitle("Registro de Habitantes de Endor");
        /*
         * Establecemos la escena,las proporciones de la ventana y cargamos los recursos del rooteo
         */
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
