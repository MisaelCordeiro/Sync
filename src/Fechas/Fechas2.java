package src.Fechas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Fechas2 {
    public static void main (String[] args){
        LocalDate fechaNacimiento = LocalDate.of(2000, 3, 15);
        LocalDate fechaActual = LocalDate.now();

        long años = ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
        long meses = ChronoUnit.MONTHS.between(fechaNacimiento, fechaActual);
        long dias = ChronoUnit.DAYS.between(fechaNacimiento, fechaActual);

        System.out.println("Años: " + años);
        System.out.println("Meses: " + meses);
        System.out.println("Días: " + dias);

    }
}
