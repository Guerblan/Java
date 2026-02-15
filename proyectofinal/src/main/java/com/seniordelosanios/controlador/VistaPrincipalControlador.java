package com.seniordelosanios.controlador;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class VistaPrincipalControlador {

    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private void onButtonClick(javafx.event.ActionEvent event) {
        try {
            Parent root = FXMLLoader
                    .load(getClass().getResource("/com/seniordelosanios/recursos/vista/VistaFicheros.fxml"));
            ((Button) event.getSource()).getScene().setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onButtonClick2(javafx.event.ActionEvent event) {
        try {
            Parent root = FXMLLoader
                    .load(getClass().getResource("/com/seniordelosanios/recursos/vista/VistaBaseDeDatos.fxml"));
            ((Button) event.getSource()).getScene().setRoot(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
