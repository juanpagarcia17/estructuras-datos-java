package lineales;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();

        tareas.add("Estudiar Java");
        tareas.add("Ir al gimnasio");
        tareas.add(1, "Almorzar"); // Insertar en posición específica

        System.out.println("Lista de tareas: " + tareas);
        tareas.remove("Ir al gimnasio"); // Eliminar elemento
        System.out.println("Tareas restantes: " + tareas);
    }
}

