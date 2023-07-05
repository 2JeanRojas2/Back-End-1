package com.marielagcw.desafio1;

import com.marielagcw.Empleado;
import com.marielagcw.Empresa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainDesafio1 {

    public static void main(String[] args) {

        // INSTANCIACIÓN DE LA EMPRESA
        List<Empleado> listadoEmpleados = new ArrayList<>();
        Empresa empresa1 = new Empresa("30-12456789-0",
                "Chinchin",
                listadoEmpleados);

        // INSTANCIACIÓN DE LOS EMPLEADOS
        Empleado empleado1 = new Empleado("Nombre 1",
                "Apellido 1",
                "NA/1",
                50.000);
        Empleado empleado2 = new Empleado("Nombre 2",
                "Apellido 2",
                "NA/2",
                65.000);
        Empleado empleado3 = new Empleado("Nombre 3",
                "Apellido 3",
                "NA/3",
                50.500);
        Empleado empleado4 = new Empleado("Nombre 4",
                "Apellido 4",
                "NA/4",
                75.000);


        // GUARDAMOS LOS EMPLEADOS EN LA LISTA DE LA EMPRESA
        listadoEmpleados.add(empleado1);
        listadoEmpleados.add(empleado2);
        listadoEmpleados.add(empleado3);
        listadoEmpleados.add(empleado4);

        // ESCRITURA DEL ARCHIVO
        /* Creamos el archivo con File donde escribimos la info */
        File fileW = new File("empresa1.txt");

        /* Dentro de un try hacemos el proceso de escritura del archivo */
        try {
            FileOutputStream fosW = new FileOutputStream(fileW);
            ObjectOutputStream oosW = new ObjectOutputStream(fosW);
            /* Escribimos dentro del archivo el objeto "empresa1" */
            oosW.writeObject(empresa1);
            /* Cerramos el archivo */
            oosW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // LECTURA DEL ARCHIVO
        /* Creamos el archivo que va permitir leer el texto */
        File fileR = new File("empresa1.txt");

        /* Creamos en un try el proceso de lectura del archivo */
        try {
            FileInputStream fisR = new FileInputStream(fileR);
            ObjectInputStream oisR = new ObjectInputStream(fisR);

            /* Leemos el archivo para recuperar los datos */
            Empresa empresa2 = (Empresa) oisR.readObject();
            System.out.println(empresa2.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}


