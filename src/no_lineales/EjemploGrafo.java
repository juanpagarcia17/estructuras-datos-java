package no_lineales;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjemploGrafo {
    public static void main(String[] args) {
        // Representación de red de amigos usando un Mapa de Listas
        Map<String, List<String>> redSocial = new HashMap<>();

        // Crear usuarios (Nodos)
        redSocial.put("Juan", new ArrayList<>());
        redSocial.put("Maria", new ArrayList<>());
        redSocial.put("Pedro", new ArrayList<>());

        // Crear conexiones/amistades (Aristas)
        redSocial.get("Juan").add("Maria");
        redSocial.get("Juan").add("Pedro");
        redSocial.get("Maria").add("Juan");

        System.out.println("Red Social Completa: " + redSocial);
        System.out.println("Amigos de Juan: " + redSocial.get("Juan"));
    }
}

