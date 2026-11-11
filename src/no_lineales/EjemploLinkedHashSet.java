package no_lineales;

import java.util.LinkedHashSet;

public class EjemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> registroVisitas = new LinkedHashSet<>();

        registroVisitas.add("192.168.1.1");
        registroVisitas.add("10.0.0.1");
        registroVisitas.add("192.168.1.1"); // Duplicado ignorado

        // Muestra los elementos únicos respetando el orden cronológico de entrada
        System.out.println("Historial de IPs únicas ordenadas: " + registroVisitas);
    }
}

