/*Imagina que trabajas en una tienda y hay una cola de clientes esperando. Usa LinkedList para gestionar la cola.
🛠 Requisitos:
Crear una LinkedList<String> llamada colaClientes.
Agregar 4 nombres de clientes a la lista (ejemplo: "Misael", "Carlos", "Ana", "Lucía").
Atender (eliminar) el primer cliente en la cola.
Mostrar la lista de clientes después de atender al primero.
 */

import java.util.LinkedList;

public class EjerFunciones3 {
    public static void main (String[] args){
        LinkedList<String> colaClientes = new LinkedList<>();
        colaClientes.add("Misael");
        colaClientes.add("Carlos");
        colaClientes.add("Ana");
        colaClientes.add("Lucia");

        String atendiendo = colaClientes.get(0);

        LinkedList<String> colaActual = new LinkedList<>(colaClientes);
        colaActual.removeFirst();

        System.out.println("Cola inicial: " + colaClientes);
        System.out.println("Atendiendo a: " + atendiendo);
        System.out.println("Cola actual: " + colaActual);
    }
}
