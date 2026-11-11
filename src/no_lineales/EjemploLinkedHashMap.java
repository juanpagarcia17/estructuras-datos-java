package no_lineales;

import java.util.LinkedHashMap;

public class EjemploLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> podio = new LinkedHashMap<>();

        podio.put(1, "Oro - Juan");
        podio.put(2, "Plata - Maria");
        podio.put(3, "Bronce - Pedro");

        // Se imprimen exactamente en el orden en que se agregaron
        System.out.println("Clasificación en orden: " + podio);
    }
}

