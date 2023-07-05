package com.Jean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FiltroDePersonas {

    List<Persona> ListaDefinitiva = new ArrayList<>();


    public void validarPersonas(Persona p) {
        if(p.esMayorDeEdad() && p.getNombre().length() >= 5){
            this.ListaDefinitiva.add(p);
        }
    }

}
