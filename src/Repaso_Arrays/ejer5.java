package src.Repaso_Arrays;

import java.util.Arrays;
import java.util.Scanner;

// contar ocurrencias de un array
public class ejer5 {
    public static void main (String[] args){
        //iniciamos array
        int[] array = {3, 5, 7, 5, 9, 5, 10, 5, 2, 5};
        int contador = 0;

        System.out.println("Array: " + Arrays.toString(array));


        //declarar scan, 
        Scanner scan = new Scanner(System.in);
      
        //pedir numero
        System.out.println("Introduce un numero: ");
        int numero = scan.nextInt();

        //recorrer array y comparar
        for (int a:array){
            if (numero == a){
                contador++;
            }
        }

        System.out.println("El numero " + numero + " se repite " + contador + " veces.");


    }
}
