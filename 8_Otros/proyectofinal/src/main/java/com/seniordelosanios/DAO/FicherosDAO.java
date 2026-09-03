package com.seniordelosanios.DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.seniordelosanios.modelo.habitante;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class FicherosDAO {
    private ObservableList<habitante> habitantes = FXCollections.observableArrayList();

    private ObservableList<habitante> leerHabitantesBinario(String filePath) {
        ObservableList<habitante> productosCargados = FXCollections.observableArrayList();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            habitante[] array = (habitante[]) ois.readObject();
            for (habitante h : array) {
                productosCargados.add(h);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + filePath);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productosCargados;
    }

    private void guardarHabitantesEnBinario(String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(habitantes.toArray(new habitante[0]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<habitante> getHabitantes() {
        return habitantes;
    }

    public void agregarHabitante(habitante h) {
        habitantes.add(h);
    }

    public void cargarDesdeArchivo(String filePath) {
        habitantes = leerHabitantesBinario(filePath);
    }

    public void guardarEnArchivo(String filePath) {
        guardarHabitantesEnBinario(filePath);
    }
}
