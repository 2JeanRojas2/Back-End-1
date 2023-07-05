package com.Jean;

public class Ministro extends MiembroGubernamental{

    private int nivelDeAcceso = 2;

    @Override
    public void leerDocumento(String documento, int tipo) {
            if((documento == "Reservado" || documento == "Secreto") && (tipo == 1  || tipo == 2)){
                System.out.println("Mensaje recibido: Ministro");
                this.sigMiembroGubernamental.leerDocumento(documento,tipo);
            }else{
                this.sigMiembroGubernamental.leerDocumento(documento,tipo);
            }
    }
}

