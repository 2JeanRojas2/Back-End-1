package com.Jean;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        paginasFavoritas p1 = new paginasFavoritas("https://www.youtube.com/", "YouTube");
        paginasFavoritas p2 = new paginasFavoritas("https://pivigames.blog/","PiviGamesBlog");
        paginasFavoritas p3 = new paginasFavoritas("https://www3.animeflv.net/","AnimeFlv");

        ArrayList<paginasFavoritas> PF = new ArrayList<>();

        PF.add(p1);
        PF.add(p2);
        PF.add(p3);

        try {
            FileOutputStream fos = new FileOutputStream("PaginasFavoritas.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(PF);
            oos.close();

            FileInputStream fis = new FileInputStream("PaginasFavoritas.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<paginasFavoritas> paginas;

            for(int i = 0; i<3; i++ ){
                System.out.println("Pagina: " + i+1);
                System.out.println("-----------------");
                paginas = (ArrayList<paginasFavoritas>) ois.readObject();
                for (paginasFavoritas p : paginas
                     ) {
                    System.out.println(p);
                }
            }
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
