package com.Jean;

public class Main {

    public static void main(String[] args) {

        MiembroGubernamental jerarquia = new Diputado().setSigMiembroGubernamental
                                        (new Ministro().setSigMiembroGubernamental
                                                (new Presidente()));

        jerarquia.leerDocumento("Reservado", 1);
        jerarquia.leerDocumento("Secreto", 2);
        jerarquia.leerDocumento("Muy Secreto", 3);

    }
}
