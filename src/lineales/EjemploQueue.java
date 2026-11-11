package lineales;

import java.util.LinkedList;
import java.util.Queue;

public class EjemploQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        // Insertar elementos (Offer)
        filaBanco.offer("Juan");
        filaBanco.offer("Maria");
        filaBanco.offer("Pedro");

        System.out.println("Fila del banco: " + filaBanco);

        // Ver quién sigue en la fila (Peek)
        System.out.println("Siguiente cliente a atender: " + filaBanco.peek());

        // Atender al cliente (Poll - elimina el primero)
        String atendido = filaBanco.poll();
        System.out.println("Se atendió a: " + atendido);
        System.out.println("Clientes restantes en fila: " + filaBanco);
    }
}
