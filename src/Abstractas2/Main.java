package src.Abstractas2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoFijo("Fijo 1", 50, 50));
        empleados.add(new EmpleadoFijo("Fijo 2", 45, 40));
        empleados.add(new EmpleadoHoras("Horas 1", 200, 10));
        empleados.add(new EmpleadoHoras("Horas 2", 100, 50));

        for (Empleado empleado : empleados){
            System.out.println(" ----- Dato -------");
            System.out.println("El empleado : " + empleado.nombre + " cobra : " + empleado.calcularSalarioFinal() + " euros");
            System.out.println( " ----- Fin -----");
        }

    }
}
