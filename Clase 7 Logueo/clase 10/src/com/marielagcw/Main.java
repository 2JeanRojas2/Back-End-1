package com.marielagcw;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PromedioService promedio = new PromedioService();
        List<Integer> listaEnteros = new ArrayList<>(); //Dentro de las boquitas se usan siempre clases y NO primitivos
        listaEnteros.add(1);
        listaEnteros.add(3);
        listaEnteros.add(8);
        listaEnteros.add(1);
        listaEnteros.add(3);
        listaEnteros.add(8);
        promedio.imprimirResultado(listaEnteros);

        List<Integer> listaEnCero = new ArrayList<>();
        promedio.imprimirResultado(listaEnCero);
    }

}
