package src.Repaso_Arrays;

import java.util.Arrays;

// rotar array a la derecha (1 posicion)
public class ejer3 {
    public static void main (String[] args){
        int[] arrayOriginal = { 1, 2, 3, 4, 5 };

        // guardamos ultimo valor
        int ultimo = arrayOriginal[arrayOriginal.length - 1];

        // recorremos array desde la derecha
        for (int i = arrayOriginal.length - 1; i > 0; i--){
            arrayOriginal[i] = arrayOriginal[i-1]; //desplaza valores a la derecha
        }
        
        arrayOriginal[0] = ultimo;

        

        System.out.println("Array : " + Arrays.toString(arrayOriginal));
        

        
    }
}
