package src.Repaso_Arrays;

import java.util.Arrays;


// ejercicio 1 : suma de pares e impares
public class ejer1 {
    public static void main (String[] args){
        // declaramos array 10 enteros
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        //inicializar array pares / impares

        int pares = 0;
        int impares = 0;


        //bucle for recorrer array
        for (int i = 0; i<array.length; i++){
            if (array[i] % 2 == 0){
                pares += array[i];
            }
            else{
                impares += array[i];
            } 

        }
        


        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Suma de los pares = " + pares);
        System.out.println("Suma de los impares = " + impares);
    }
}
