package com.Jean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FiltroDePersonasTest {

    @Test
    void validarPersona_deberiaPasarSoloDosPersonasQueCumplenConLosCriterios(){

        FiltroDePersonas sujetoDePrueba = new FiltroDePersonas();
        Persona p1 = new Persona ("Juan", 15);
        Persona p2 = new Persona("Pedro", 19);
        Persona p3 = new Persona("Ana", 20);
        Persona p4 = new Persona("Luz", 17);
        Persona p5 = new Persona("Julian", 20);

        sujetoDePrueba.validarPersonas(p1);
        sujetoDePrueba.validarPersonas(p2);
        sujetoDePrueba.validarPersonas(p3);
        sujetoDePrueba.validarPersonas(p4);
        sujetoDePrueba.validarPersonas(p5);

        Assertions.assertTrue(sujetoDePrueba.getListaDefinitiva().size() == 2);

    }

}