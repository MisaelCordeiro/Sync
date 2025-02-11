// Ejercicio 4 (Nuevo): Números Pares e Impares con ArrayList

import java.util.ArrayList;

public class Ejer5 {
    public static void main (String[] args){
        ArrayList<Integer> arrayOriginal = new ArrayList<>();
        ArrayList<Integer> arrayPares = new ArrayList<>();
        ArrayList<Integer> arrayImpares = new ArrayList<>();

        arrayOriginal.add(3);
        arrayOriginal.add(5);
        arrayOriginal.add(6);
        arrayOriginal.add(38);
        arrayOriginal.add(32);
        arrayOriginal.add(20);
        arrayOriginal.add(29);
        arrayOriginal.add(21);
        arrayOriginal.add(45);
        arrayOriginal.add(76);
        arrayOriginal.add(99);
        System.out.println("ArrayList original: " + arrayOriginal);

        /* 
        for (int i=0; i < arrayOriginal.size(); i++){
            if (arrayOriginal.get(i) % 2 == 0){
                arrayPares.add(arrayOriginal.get(i));
            }
            else {
                arrayImpares.add(arrayOriginal.get(i));
            }
        }
            */

        for (int num : arrayOriginal){
            if (num % 2 == 0){
                arrayPares.add(num);
            }
            else {
                arrayImpares.add(num);
            }
        }

        System.out.println("ArrayList pares: " + arrayPares);
        System.out.println("ArrayList impares: " + arrayImpares);


    }
}
