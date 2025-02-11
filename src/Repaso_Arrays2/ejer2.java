package src.Repaso_Arrays2;

import java.util.Arrays;

public class ejer2 {
    public static void main (String[] args){
        int[] array = {1, 2, 3, 2, 1};
        System.out.println("Array : " + Arrays.toString(array));
        boolean pali = true;

        for (int i = 0; i < array.length / 2 ; i++){ // recorremos solo hasta la mitad
            if(array[i] != array[array.length - 1 - i]){ // aqui comparamos el opuesto
                pali = false;
                break;
            }
        }

        if(pali){
            System.out.println("El array es palindromo");
        
        }else{
            System.out.println("No es palindromo");
        }
    }
}
 