package com.dh.integradora1.ventas;

public class Pasante extends Vendedor {

    private int ventasRealizadas;

    public Pasante(int ventasRealizadas, String nombre) {
        super(nombre);
        this.ventasRealizadas = ventasRealizadas;
    }

    @Override
    public String mostrarCategoria() {
        int puntajeFinal =  (5 * this.ventasRealizadas);
        String categoría = "";

        if(puntajeFinal < 50){
            categoría = "Pasante novato";
        }else if(puntajeFinal >= 50){
            categoría = "Pasante experimentado";
        }

        String respuesta = this.nombre + " tiene un total de " + puntajeFinal + " puntos y categoriza como " + categoría;

        return respuesta;
    }
}
