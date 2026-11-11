package no_lineales;

import java.util.TreeSet;

public class EjemploTree {
    public static void main(String[] args) {
        // TreeSet almacena elementos de forma jerárquica y ordenada automáticamente (Árbol Rojo-Negro)
        TreeSet<Integer> numeros = new TreeSet<>();

        numeros.add(45);
        numeros.add(12);
        numeros.add(89);
        numeros.add(3);

        // Los elementos se imprimen ordenados de menor a mayor gracias a la estructura del árbol
        System.out.println("Árbol ordenado: " + numeros);

        // Operaciones eficientes de búsqueda en el árbol
        System.out.println("Número más bajo: " + numeros.first());
        System.out.println("Número más alto: " + numeros.last());
    }
}

