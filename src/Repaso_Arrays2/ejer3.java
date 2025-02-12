package src.Repaso_Arrays2;
// Ejercicio 3: Compactar un Array Eliminando Duplicados

import java.util.ArrayList;


public class ejer3 {
    public static void main (String[] args){
        ArrayList<Integer> original = new ArrayList<>();
        ArrayList<Integer> sinDuplicados = new ArrayList<>();
        original.add(4);
        original.add(5);
        original.add(9);
        original.add(4);
        original.add(3);
        original.add(5);
        original.add(8);
        original.add(9);
        original.add(1);

        for (Integer num : original){
            if(!sinDuplicados.contains(num)){
                sinDuplicados.add(num);
            }
        }



        System.out.println("Array original: " + original);
        System.out.println("Array sin duplis: " + sinDuplicados);
    }
}
