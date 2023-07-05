package com.marielagcw;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.List;

public class PromedioService {
    /* Necesitamos crear primero un registrador de logger */
    final static Logger logger = Logger.getLogger(TestListaPromedio.class);

    public Integer imprimirResultado(List<Integer> listaEnteros){
        if(listaEnteros.size()<=0){
            logger.log(Level.ERROR,"La lista es igual a 0");
        } else {
            if(listaEnteros.size()>5){
                logger.log(Level.INFO,"La longitud de la lista es mayor a 5");
            }
            if (listaEnteros.size()>10){
                logger.log(Level.INFO,"La longitud de la lista es mayor a 10");
            }

            Integer resultadoPromedio = calcularPromedio(listaEnteros);
            logger.log(Level.INFO, "El promedio es " + resultadoPromedio);
            return resultadoPromedio;
        }

        return null;
    }
    public Integer calcularPromedio(List<Integer> enteros) {
        Integer acumulador = 0;
        for (Integer entero : enteros) {
            acumulador = acumulador + entero;
        }
        return acumulador/enteros.size();
    }
}
