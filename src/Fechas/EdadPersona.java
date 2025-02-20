package src.Fechas;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class EdadPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate fechaNacimiento = null;
        LocalDate fechaActual = LocalDate.now();

        while (fechaNacimiento == null) {
            try {
                // Pedimos fecha de nacimiento
                System.out.println("Por favor introduce tu fecha de nacimiento:");

                System.out.print("Año (Ejemplo: 1998): ");
                int year = scanner.nextInt();

                System.out.print("Mes (1-12): ");
                int month = scanner.nextInt();

                System.out.print("Día (1-31): ");
                int day = scanner.nextInt();

                // Intentamos crear la fecha
                fechaNacimiento = LocalDate.of(year, month, day);

                // Verificamos que la fecha no sea futura
                if (fechaNacimiento.isAfter(fechaActual)) {
                    System.out.println("❌ La fecha de nacimiento no puede estar en el futuro. Intenta nuevamente.");
                    fechaNacimiento = null;
                }

            } catch (DateTimeParseException e) {
                System.out.println("❌ Fecha no válida. Intenta nuevamente.");
                scanner.nextLine(); // Limpiar buffer del scanner
                fechaNacimiento = null;
            } catch (Exception e) {
                System.out.println("❌ Entrada inválida. Asegúrate de introducir valores numéricos correctos.");
                scanner.nextLine(); // Limpiar buffer
                fechaNacimiento = null;
            }
        }

        // Cálculo de la edad correctamente ajustado
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();

        // Ajuste según el mes y día de nacimiento
        if (fechaNacimiento.getMonthValue() > fechaActual.getMonthValue() || 
           (fechaNacimiento.getMonthValue() == fechaActual.getMonthValue() && fechaNacimiento.getDayOfMonth() > fechaActual.getDayOfMonth())) {
            edad--; // Aún no ha cumplido años en este año
        }

        System.out.println("✅ Tienes " + edad + " años.");
        scanner.close();
    }
}
