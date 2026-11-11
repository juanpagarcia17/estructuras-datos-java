package no_lineales;

import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> inventario = new HashMap<>();

        // Guardar elementos (Put)
        inventario.put("Laptops", 15);
        inventario.put("Teclados", 50);
        inventario.put("Monitores", 22);

        // Acceder a un valor por su clave (Get)
        System.out.println("Cantidad de Teclados: " + inventario.get("Teclados"));

        // Verificar si existe una clave
        if (inventario.containsKey("Laptops")) {
            System.out.println("Sí hay laptops disponibles en el inventario.");
        }

        // Mostrar todo el mapa
        System.out.println("Inventario completo: " + inventario);
    }
}

