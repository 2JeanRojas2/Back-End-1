package com.Jean;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Contacto c1 = new Contacto("Mari", "mari@gmail.com", 312233233);
        Contacto c2 = new Contacto("juan", "juan@gmail.com", 312233283);
        Contacto c3 = new Contacto("Pivi", "pivi@gmail.com", 312233273);

        ArrayList<Contacto> contactos = new ArrayList<>();

        contactos.add(c1);
        contactos.add(c2);
        contactos.add(c3);

        try{
            FileOutputStream fos = new FileOutputStream("Contactos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(contactos);
            oos.close();

            FileInputStream fis = new FileInputStream("Contactos.txt");
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
