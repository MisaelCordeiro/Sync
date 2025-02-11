package src.Repaso_Arrays2;

import java.util.Arrays;
import java.util.Scanner;

public class ejer1 {
    public static void main (String[] args){
        int[] array = {2, 7, 11, 15, 1, 8, 3, 6, 4, 5};
        System.out.println("Array : " + Arrays.toString(array));

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero objetivo: ");
        int numeroObjetivo = scan.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i] + array[j] == numeroObjetivo){
                    System.out.println("Los números que forman " + numeroObjetivo + " son: " + array[i] + " y " + array[j]);
                    encontrado = true;
                }
                
            }
        }

        if (!encontrado){
            System.out.println("No hay numeros que sumen : " + numeroObjetivo);
        }
    }
}
