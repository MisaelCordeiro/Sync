package src.Repaso_Arrays2;

import java.util.Arrays;

// Ejercicio 4: Buscar el Elemento más Frecuente en un Array
public class ejer4 {
    public static void main (String[] args){
        int[] array = {3, 7, 3, 2, 3, 7, 8, 7, 7, 3};

        System.out.println("Array : " + Arrays.toString(array));

        // creamos variables para almacenar el num de repes y el num mas frecuente
        int maxRepeticiones = 0;
        int numeroMasFrecuente = -1;

        //recorremos array
        for(int i = 0 ; i < array.length; i++){
            // iniciamos dentro del primer bucle para que se repita con cada numero a comparar
            int contador = 0;

            for (int j=0; j < array.length; j++){
                if (array[i] == array[j]){
                    contador++;
                }
            }
            // aqui vamos comparando y asignando valores
            if(contador > maxRepeticiones){
                maxRepeticiones = contador;
                numeroMasFrecuente = array[i];
            }
        }

        System.out.println("El número más repetido es: " + numeroMasFrecuente + " y se repite " + maxRepeticiones + " veces.");
        
    }
}
