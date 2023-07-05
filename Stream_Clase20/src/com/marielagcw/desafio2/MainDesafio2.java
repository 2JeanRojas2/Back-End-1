package com.marielagcw.desafio2;



import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainDesafio2 {
    public static void main(String[] args) throws
            FileNotFoundException {

        // ESCRITURA
        FileOutputStream fo = new FileOutputStream("empleados.txt");
        BufferedOutputStream bo = new BufferedOutputStream(fo);
        String texto = "Juan;Rodriguez;1154;56000;Jorge;Sanchez;2322;74000;Mario;Martinez;5420;46000;Santiago;Pereyra;7293;75000";
        try {
            bo.write(texto.getBytes());
            System.out.println("El byte fue escrito correctamente");
            bo.close();
            fo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // LECTURA
        FileInputStream fi = new FileInputStream("empleados.txt");
        BufferedInputStream bi = new BufferedInputStream(fi);

        try {
            int i;
            while((i=bi.read()) != -1) {
                System.out.print((char)i);
            }

            bi.close();
            fi.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}


