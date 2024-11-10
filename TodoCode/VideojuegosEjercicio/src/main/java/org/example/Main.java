package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Videojuego> vjs = new ArrayList<>();

        Videojuego vj1 = new Videojuego(1L, "GTA 5", "PlayStation 4",
                100000L, "accion");
        Videojuego vj2 = new Videojuego(2L, "FIFA 2024", "PlayStation 4",
                103000L, "futbol");
        Videojuego vj3 = new Videojuego(3L, "Overwatch", "Xbox One",
                10000L, "shooter");
        Videojuego vj4 = new Videojuego(4L, "Alien", "PC",
                12000L, "aventura");
        Videojuego vj5 = new Videojuego(5L, "God of War", "Xbox One",
                3000L, "aventura");

        vjs.add(vj1);
        vjs.add(vj2);
        vjs.add(vj3);
        vjs.add(vj4);
        vjs.add(vj5);

        displayVJ(vjs);

        vjs.get(1).setTitulo("FIFA 2025");
        vjs.get(1).setCantidadJugadores(104000L);

        vjs.get(4).setTitulo("Assasin Creed I");
        vjs.get(4).setCantidadJugadores(18939L);

        displayVJ(vjs);

        System.out.println("-----------------");

        for (int i = 0; i < vjs.size(); i++) {
            if (vjs.get(i).getConsola().equals("Xbox One")) {
                System.out.println((i+1) + ") " + vjs.get(i).getTitulo() + " - " + vjs.get(i).getConsola() + " - " +
                        vjs.get(i).getCantidadJugadores());
            }
        }

    }

    public static void displayVJ(List<Videojuego> vjs) {
        System.out.println("VIDEOJUEGOS:");
        System.out.println("------------");
        for (int i = 0; i < vjs.size(); i++) {
            System.out.println((i+1) + ") " + vjs.get(i).getTitulo() + " - " + vjs.get(i).getConsola() + " - " +
                    vjs.get(i).getCantidadJugadores());
        }
    }
}