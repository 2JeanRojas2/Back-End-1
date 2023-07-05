package com.Jean;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Empresa e1 = new Empresa(1234, "Empresa1");
        var empleados = Arrays.asList( new Empleado("juan", "perez", 1567, 200.0),
                                                     new Empleado("jean", "rojas", 15987, 200.0),
                                                     new Empleado("luis", "sanches", 153467, 200.0));
    }

        try(FileOutputStream fos = new FileOutputStream("Empresa.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);){
            oos.writeObject(e1);
            oos.close();

            FileInputStream fis = new FileInputStream("Empresa.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println(ois.readObject());
            ois.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
