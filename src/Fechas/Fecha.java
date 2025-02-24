package src.Fechas;

import java.time.LocalDate;

public class Fecha {
    public static void main (String[] args){
        LocalDate fechaNacimiento = LocalDate.of(1998,6, 20);
        System.out.println("Fecha nacimiento : " + fechaNacimiento );
        System.out.println("Fecha nacimiento : " + fechaNacimiento.getYear() );
        System.out.println("Fecha nacimiento : " + fechaNacimiento.getDayOfMonth() );
        System.out.println("Fecha nacimiento : " + fechaNacimiento.getMonthValue() );
        System.out.println("Fecha nacimiento : " + fechaNacimiento.getMonth() );
        System.out.println("Fecha nacimiento : " + fechaNacimiento.getDayOfWeek() );


        LocalDate fecha1 = LocalDate.of(2024, 6, 1);
        LocalDate fecha2 = LocalDate.of(2025, 1, 1);

        if (fecha1.isBefore(fecha2)) {
            System.out.println("fecha1 es anterior a fecha2");
        }

        if (fecha2.isAfter(fecha1)) {
            System.out.println("fecha2 es posterior a fecha1");
        }

        


    }
}
