package src.Repaso_Arrays;

import java.util.Arrays;

// Ejercicio 2: Encontrar el Segundo Número Mayor en un Array
public class ejer2 {
    public static void main (String[] args){
        // declaramos array
        int[] numeros = {15, 42, 10, 24, 35, 99, 87, 60, 12, 44};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        
        for (int num:numeros){
            if (num>max1){
                max2 = max1;
                max1 = num;
            }
            else if (num > max2 && num != max1){
                max2 = num;
            }
        }

        System.out.println("Array : " + Arrays.toString(numeros));
        System.out.println("El numero mas grande es : " + max1);
        System.out.println("El segundo numero mas grande es : " + max2);



       
    }
}
