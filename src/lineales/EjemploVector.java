package lineales;

import java.util.Vector;

public class EjemploVector {
    public static void main(String[] args) {
        Vector<Integer> componentes = new Vector<>();

        componentes.add(101);
        componentes.add(202);
        
        System.out.println("Capacidad inicial del Vector: " + componentes.capacity());
        System.out.println("Elemento en índice 0: " + componentes.get(0));
    }
}

