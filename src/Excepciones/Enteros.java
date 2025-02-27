package src.Excepciones;

import java.util.Scanner;

public class Enteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pedimos al usuario que ingrese los dos numeros
        System.out.println("Ingresa el primer numero (dividendo): ");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo numero (divisor)");
        int num2 = scanner.nextInt();

        try{
            int resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("Error : No se puede dividir entre 0");
        }

        scanner.close();
    }
}
