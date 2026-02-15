package com.seniordelosanios.modelo;

import java.io.Serializable;

public class habitante implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private int edad;
    private String raza;
    private String ocupacion;
    private String localidad;

    public habitante() {
    }

    public habitante(String nombre, int edad, String raza, String ocupacion, String localidad) {

        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.ocupacion = ocupacion;
        this.localidad = localidad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "habitante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", localidad='" + localidad + '\'' +
                '}';
    }

    public static Object toArray(habitante[] habitantes) {
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }
}
