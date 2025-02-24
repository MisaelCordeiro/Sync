package src.Fechas;

import java.time.LocalDateTime;

public class Hora {
    public static void main (String[] args){
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println("Fecha y Hora Actual: " + fechaHoraActual);

        LocalDateTime fechaHora = LocalDateTime.of(2024, 6, 15, 14, 30);
        System.out.println("Fecha y Hora específica: " + fechaHora);

        LocalDateTime ahora = LocalDateTime.now();

        System.out.println("Hora: " + ahora.getHour());
        System.out.println("Minuto: " + ahora.getMinute());
        System.out.println("Segundo: " + ahora.getSecond());


        LocalDateTime masCincoHoras = ahora.plusHours(5);
        LocalDateTime menosTreintaMinutos = ahora.minusMinutes(30);

        System.out.println("Hora actual: " + ahora);
        System.out.println("Después de 5 horas: " + masCincoHoras);
        System.out.println("Hace 30 minutos: " + menosTreintaMinutos);

        LocalDateTime fecha1 = LocalDateTime.of(2024, 5, 10, 12, 0);
        LocalDateTime fecha2 = LocalDateTime.of(2025, 1, 1, 15, 30);

        if (fecha1.isBefore(fecha2)) {
            System.out.println("fecha1 es anterior a fecha2");
        }

        if (fecha2.isAfter(fecha1)) {
            System.out.println("fecha2 es posterior a fecha1");
}


    }
}
