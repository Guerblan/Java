package com.seniordelosanios.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.seniordelosanios.modelo.habitante;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

public class BaseDeDatosDAO {
    private ObservableList<habitante> habitantes = FXCollections.observableArrayList();

    public ObservableList<habitante> getHabitantes() {
        return habitantes;
    }

    public void cargarHabitantes() {
        habitantes.clear();
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:habitantes.db")) {
            String query = "SELECT * FROM habitantes";
            java.sql.Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                habitante h = new habitante(
                        rs.getString("nombre"),
                        rs.getInt("edad"),
                        rs.getString("raza"),
                        rs.getString("ocupacion"),
                        rs.getString("localidad"));
                habitantes.add(h);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void guardarHabitante(habitante h) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:habitantes.db")) {
            String insertSQL = "INSERT INTO habitantes (nombre,edad, raza, ocupacion, localidad) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setString(1, h.getNombre());
            pstmt.setInt(2, h.getEdad());
            pstmt.setString(3, h.getRaza());
            pstmt.setString(4, h.getOcupacion());
            pstmt.setString(5, h.getLocalidad());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarHabitantePorNombre(String nombre) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:habitantes.db")) {
            String deleteSQL = "DELETE FROM habitantes WHERE nombre = ?";
            PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
            pstmt.setString(1, nombre);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public BaseDeDatosDAO() {
        crearTablaSiNoExiste();
    }

    private void crearTablaSiNoExiste() {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:habitantes.db")) {
            String sql = "CREATE TABLE IF NOT EXISTS habitantes (" +
                    "nombre TEXT NOT NULL, " +
                    "edad INTEGER NOT NULL, " +
                    "raza TEXT NOT NULL, " +
                    "ocupacion TEXT NOT NULL, " +
                    "localidad TEXT NOT NULL)";
            conn.createStatement().execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
