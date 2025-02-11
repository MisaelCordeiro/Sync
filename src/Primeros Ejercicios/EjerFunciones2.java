
/* Crea un programa en Java que permita gestionar una lista de tareas usando ArrayList. El programa debe
Crear un ArrayList<String> llamado tareas.
Agregar al menos 3 tareas a la lista.
Eliminar una tarea específica de la lista.
Mostrar la lista de tareas actualizada. */

import java.util.ArrayList;

public class EjerFunciones2 {
    public static void main (String[] args){
        ArrayList<String> tareas = new ArrayList<>();

        tareas.add("Entrenar");
        tareas.add("Cocinar");
        tareas.add("Estudiar");

        ArrayList<String> tareasActualizadas = new ArrayList<>(tareas); // esto lo hacemos para que no replique directamente sobre el ArrayList de tareas. Creamos una copia independiente
        tareasActualizadas.remove("Cocinar");

        System.out.println("Tareas pendientes: " + tareas);
        System.out.println("Tareas actualizadas: " + tareasActualizadas);
    }
}
