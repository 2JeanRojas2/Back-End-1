package com.Jean;

import java.io.Serializable;

public class Contacto implements Serializable {

    private String nombre;
    private String mail;
    private int telefono;

    public Contacto(String nombre, String mail, int telefono) {
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
