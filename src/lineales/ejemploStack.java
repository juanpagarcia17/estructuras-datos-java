package lineales;

import java.util.Stack;

public class ejemploStack {
    public static void main(String[] args) {
        Stack<String> historial = new Stack<>();

        // Insertar elementos (Push)
        historial.push("google.com");
        historial.push("github.com");
        historial.push("stackoverflow.com");

        System.out.println("Historial actual: " + historial);

        // Ver el elemento de arriba sin sacarlo (Peek)
        System.out.println("Última página visitada: " + historial.peek());

        // Eliminar el elemento de arriba (Pop)
        String eliminado = historial.pop();
        System.out.println("Se presionó el botón 'Atrás'. Salimos de: " + eliminado);
        System.out.println("Historial restante: " + historial);
    }
}
