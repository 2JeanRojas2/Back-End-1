package com.Jean;

import java.util.Date;

public class Empleado {
    private int id;
    private String nombre;
    private int edad;
    private String empresa;


    public Empleado() {
    }

    public Empleado(int id, String nombre, int edad, String empresa) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public static void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
