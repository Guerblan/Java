package com.seniordelosanios.controlador;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import com.seniordelosanios.modelo.habitante;
import com.seniordelosanios.DAO.BaseDeDatosDAO;
import javafx.scene.control.cell.PropertyValueFactory;

public class VistaBaseDeDatosControlador {
    @FXML
    private TableView<habitante> tablaHabitantes;
    @FXML
    private TableColumn<habitante, String> nombreCol;
    @FXML
    private TableColumn<habitante, Integer> edadCol;
    @FXML
    private TableColumn<habitante, String> razaCol;
    @FXML
    private TableColumn<habitante, String> ocupacionCol;
    @FXML
    private TableColumn<habitante, String> localidadCol;

    @FXML
    private javafx.scene.control.TextField nombreField;
    @FXML
    private javafx.scene.control.TextField edadField;
    @FXML
    private javafx.scene.control.ComboBox<String> razaCombo;
    @FXML
    private javafx.scene.control.ComboBox<String> ocupacionCombo;
    @FXML
    private javafx.scene.control.ComboBox<String> localidadCombo;

    private BaseDeDatosDAO baseDeDatosDAO = new BaseDeDatosDAO();

    @FXML
    public void initialize() {
        nombreCol.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        edadCol.setCellValueFactory(new PropertyValueFactory<>("edad"));
        razaCol.setCellValueFactory(new PropertyValueFactory<>("raza"));
        ocupacionCol.setCellValueFactory(new PropertyValueFactory<>("ocupacion"));
        localidadCol.setCellValueFactory(new PropertyValueFactory<>("localidad"));
        razaCombo.getItems().addAll("Humano", "Elfo", "Orco", "Hobbit", "Enano","Nazgul");
        ocupacionCombo.getItems().addAll(
                "Guerrero", "Mago", "Rey", "Jardinero", "Arquero", "Herrero", "Explorador", "Capitán", "Ladrón",
                "Sanador", "Consejero", "Escudero", "Señor Oscuro", "Portador del Anillo", "Montaraz");
        localidadCombo.getItems().addAll(
                "La Comarca", "Rivendel", "Minas Tirith", "Edoras", "Lothlórien",
                "Moria", "Isengard", "Gondor", "Rohan", "Mordor", "Bree", "Dale", "Erebor", "Lago Largo");
        tablaHabitantes.setItems(baseDeDatosDAO.getHabitantes());
        baseDeDatosDAO.cargarHabitantes();
        tablaHabitantes.refresh();
    }

    @FXML
    private void onButtonClick(javafx.event.ActionEvent event) {
        try {
            Parent root = FXMLLoader
                    .load(getClass().getResource("/com/seniordelosanios/recursos/vista/VistaPrincipal.fxml"));
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

    @FXML
    private void onButtonClick3(javafx.event.ActionEvent event) {
        try {
            String nombre = nombreField.getText();
            int edad = Integer.parseInt(edadField.getText());
            String raza = razaCombo.getValue();
            String ocupacion = ocupacionCombo.getValue();
            String localidad = localidadCombo.getValue();
            habitante h = new habitante(nombre, edad, raza, ocupacion, localidad);
            baseDeDatosDAO.guardarHabitante(h);
            baseDeDatosDAO.cargarHabitantes();
            tablaHabitantes.setItems(baseDeDatosDAO.getHabitantes());
            tablaHabitantes.refresh();
            nombreField.clear();
            edadField.clear();
            razaCombo.getSelectionModel().clearSelection();
            ocupacionCombo.getSelectionModel().clearSelection();
            localidadCombo.getSelectionModel().clearSelection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onButtonClick4(javafx.event.ActionEvent event) {
        habitante seleccionado = tablaHabitantes.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            baseDeDatosDAO.eliminarHabitantePorNombre(seleccionado.getNombre());
            baseDeDatosDAO.cargarHabitantes();
            tablaHabitantes.setItems(baseDeDatosDAO.getHabitantes());
            tablaHabitantes.refresh();
        }
    }
}
