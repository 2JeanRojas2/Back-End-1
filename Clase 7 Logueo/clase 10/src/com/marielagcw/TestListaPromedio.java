package com.marielagcw;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/* Desarrollo del ejercicio con TDD */

class TestListaPromedio {

    /* Creamos el test */
    @Test
    public void test(){
        // DADO
        PromedioService promedio = new PromedioService();

        /* Armamos una lista de prueba */
        List<Integer> listaEnteros = new ArrayList<>(); //Dentro de las boquitas se usan siempre clases y NO primitivos
        listaEnteros.add(1);
        listaEnteros.add(3);
        listaEnteros.add(8);

        //CUANDO
        /* Implementamos el método de prueba */
       Integer resultado = promedio.imprimirResultado(listaEnteros);

        //ENTONCES
        /* Comparamos el resultado esperado con el real */
        assertEquals(4, resultado);

    }
}
