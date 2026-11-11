package no_lineales;

import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        HashSet<String> usuariosunicos = new HashSet<>();

        usuariosunicos.add("juan123");
        usuariosunicos.add("maria45");
        usuariosunicos.add("juan123"); // Intento duplicado (se ignora)

        System.out.println("Total usuarios registrados (sin duplicar): " + usuariosunicos.size());
        System.out.println("Lista de usuarios: " + usuariosunicos);
    }
}

