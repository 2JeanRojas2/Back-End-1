package com.Jean;

import java.io.Serializable;

public class paginasFavoritas implements Serializable {

    private String url;
    private String nombre;

    public paginasFavoritas(String url, String nombre) {
        this.url = url;
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "paginasFavoritas{" +
                "url='" + url + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
