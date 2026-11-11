package lineales;

import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        // Agregar elementos
        playlist.add("Canción 1");
        playlist.add("Canción 2");
        playlist.addFirst("Intro (Primera)"); // Insertar al inicio

        System.out.println("Lista de reproducción: " + playlist);
        System.out.println("Siguiente canción: " + playlist.get(1));
    }
}

