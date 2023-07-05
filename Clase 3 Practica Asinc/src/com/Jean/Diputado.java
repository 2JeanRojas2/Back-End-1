package com.Jean;

public class Diputado extends MiembroGubernamental{

    private int nivelDeAcceso = 1;

    @Override
    public void leerDocumento(String documento, int tipo) {
        if(documento == "Reservado" && tipo == 1){
            System.out.println("Mensaje recibido: Diputado");
            this.sigMiembroGubernamental.leerDocumento(documento,tipo);
        }else{
            this.sigMiembroGubernamental.leerDocumento(documento,tipo);
        }
    }
}
