package lineales;

public class EjemploArray {
    public static void main(String[] args) {
        // Declaración e inicialización de un Array de tamaño fijo (5)
        int[] calificaciones = {85, 90, 78, 92, 88};

        // Acceso por índice
        System.out.println("Primera calificación: " + calificaciones[0]);

        // Modificar un elemento
        calificaciones[2] = 95;

        // Recorrer el array linealmente
        System.out.print("Todas las calificaciones: ");
        for (int nota : calificaciones) {
            System.out.print(nota + " ");
        }
    }
}

