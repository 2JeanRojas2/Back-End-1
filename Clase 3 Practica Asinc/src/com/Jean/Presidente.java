package com.Jean;

public class Presidente extends MiembroGubernamental {

    private int nivelDeAcceso = 3;

    @Override
    public void leerDocumento(String documento, int tipo) {
        System.out.println("Mensaje recibido: Presidente");
    }
}
